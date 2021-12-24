package com.mongo.service.kafka;

import com.mongo.service.entity.LoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class KafkaPublisher {

        public static final String TOPIC="LOAN_REQUEST_IN";
        public static final String GROUP_ID="groupId";

        @Autowired
        KafkaTemplate<String,LoanRequest> kafkaTemplate;

        //@Value("${topic.name.producer}")
        //@Value("${kafka.topic.json}")
        //String kafka_topic;

        public  void  send(LoanRequest loanRequest){
          ListenableFuture<SendResult<String, LoanRequest>> result =      kafkaTemplate.send(TOPIC,loanRequest);
                System.out.println("  Kafka Send response -----------> " +result.toString());
        }




}
