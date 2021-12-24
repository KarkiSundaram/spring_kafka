package com.mongo.service.repository;

import com.mongo.service.entity.LoanRequest;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRequestRepository extends MongoRepository<LoanRequest,String> {

}
