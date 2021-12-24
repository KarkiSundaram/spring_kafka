package com.mongo.service.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.math.BigDecimal;

@Document
public class LoanRequest {
    @Id
    private String id;
    private String uuid;
    private String applicantName;
    private String bankName;
    private String loanPurpose;
    private BigDecimal loanAmount;

    public LoanRequest(String id, String applicantName, String bankName, String loanPurpose, BigDecimal loanAmount) {
        this.id = id;
        this.applicantName = applicantName;
        this.bankName = bankName;
        this.loanPurpose = loanPurpose;
        this.loanAmount = loanAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public String toString() {
        return "LoanRequest{" +
                "id='" + id + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", loanPurpose='" + loanPurpose + '\'' +
                ", loanAmount=" + loanAmount +
                '}';
    }
}
