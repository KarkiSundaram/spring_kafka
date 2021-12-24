package com.mongo.service.kafka;

import com.mongo.service.entity.LoanRequestStatus;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LoanStatusConsumerListener {


    @KafkaListener(topics = "LOAN_STATUS_OUT", groupId="statusId")
    public void listen(LoanRequestStatus loanRequest) {
        System.out.println("Loan Request status info--> : " +loanRequest.toString());

        //loanService.validateBankLoanRequest(loanRequest);
    }

}
