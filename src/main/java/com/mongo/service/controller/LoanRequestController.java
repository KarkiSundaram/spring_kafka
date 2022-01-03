package com.mongo.service.controller;

import com.mongo.service.entity.LoanRequest;
import com.mongo.service.kafka.KafkaPublisher;
import com.mongo.service.repository.LoanRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value ="request/loan/v1")
public class LoanRequestController {

    @Autowired
    LoanRequestRepository  loanRequestRepository;

    @Autowired
    KafkaPublisher kafkaPublisher;

    @GetMapping(value = "/check/status/{id}")
    public ResponseEntity checkLoanStatus(@PathVariable String id){

        Optional<LoanRequest> responseData = loanRequestRepository.findById(id);
        if(responseData.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(responseData.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

    }

    @PostMapping("/get/loan")
    @Async
    public ResponseEntity requestLoan(@RequestBody LoanRequest request){
            request.setUuid(UUID.randomUUID().toString());
            loanRequestRepository.save(request);
            kafkaPublisher.send(request);
            return ResponseEntity.status(HttpStatus.OK).body("Loan Request submitted successfully. Please query the UUID to get the status -> ".concat(" "+request.getUuid()));
    }


    /*@GetMapping("/status")
    @Bean
    ApplicationRunner runner (ConsumerFactory< String, String> cf){
        return args -> {
            try (Consumer<String, String> consumer = cf.createConsumer()) {
                TopicPartition tp = new TopicPartition("LOAN_STATUS_OUT", 0);
                consumer.assign(Collections.singleton(tp));
                consumer.seek(tp, 2);
                ConsumerRecords<String, String> records = consumer.poll(Duration.ofSeconds(5));
                System.out.println(records.iterator().next().value());
            }
        };
    }*/


}
