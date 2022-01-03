package com.mongo.service.async;

import com.mongo.service.controller.MyLongRunningRunnable;
import com.mongo.service.entity.LoanRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class AsyncServiceImpl {

    @Autowired
    MongoRepository mongoRepository;

    @Async("asyncExecutor")
public CompletableFuture<List<LoanRequest>> getLoanRequestData(MyLongRunningRunnable myLongRunningRunnable) throws InterruptedException {

        System.out.println("Inside Async Serivce Executor  ---- >");
        Thread.sleep(10000L);
        return CompletableFuture.completedFuture(mongoRepository.findAll());
}

}
