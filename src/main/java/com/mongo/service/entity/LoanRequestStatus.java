package com.mongo.service.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document
public class LoanRequestStatus {

    private String id;
    private String uuid;
    private String applicantName;
    private String bankName;
    private String loanPurpose;
    private BigDecimal loanAmount;
    private String status;
    private String rejectionReason;
    private String rejectionAdvice;


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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public String getRejectionAdvice() {
        return rejectionAdvice;
    }

    public void setRejectionAdvice(String rejectionAdvice) {
        this.rejectionAdvice = rejectionAdvice;
    }

    @Override
    public String toString() {
        return "LoanRequestStatus{" +
                "id='" + id + '\'' +
                ", uuid='" + uuid + '\'' +
                ", applicantName='" + applicantName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", loanPurpose='" + loanPurpose + '\'' +
                ", loanAmount=" + loanAmount +
                ", status='" + status + '\'' +
                ", rejectionReason='" + rejectionReason + '\'' +
                ", rejectionAdvice='" + rejectionAdvice + '\'' +
                '}';
    }
}
