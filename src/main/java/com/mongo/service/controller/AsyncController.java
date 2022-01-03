package com.mongo.service.controller;

import com.mongo.service.async.AsyncServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncServiceImpl asyncService;

    @GetMapping("fetch/all")
    private ResponseEntity fetchAllLoanRequest() throws InterruptedException {

     asyncService.getLoanRequestData(new MyLongRunningRunnable());

        return ResponseEntity.status(HttpStatus.OK).body("Request Submitted");

    }

}
