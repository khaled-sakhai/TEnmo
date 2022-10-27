package com.techelevator.tenmo.model;



import java.math.BigDecimal;


public class Transfer {
    // need to get the correct datatypes
    private Long transferId;
    private Long transferTypeId;
    private Long transferStatusId;
    private Long accountFrom;
    private Long accountTo;
    private BigDecimal amount;

    public Long getTransferId() {
        return transferId;
    }

    public void setTransferId(Long transferId) {
        this.transferId = transferId;
    }

    public Long getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(Long transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public Long getTransferStatusId() {
        return transferStatusId;
    }

    public void setTransferStatusId(Long transferStatusId) {
        this.transferStatusId = transferStatusId;
    }

    public Long getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Long accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Long getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Long accountTo) {
        this.accountTo = accountTo;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Transfer() { }

    public Transfer(Long transferTypeId, Long transferStatusId, Long accountFrom, Long accountTo, BigDecimal amount) {
        //need to look at that thing that generates id in a serialized way
        this.transferTypeId = transferTypeId;
        this.transferStatusId = transferStatusId;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }



    @Override
    public String toString() {
        return "Transfer{" +
                "transfer_id=" + transferId +
                ", transfer_type_id=" + transferTypeId +
                ", transfer_status_id=" + transferStatusId +
                ", account_from=" + accountFrom +
                ", account_to=" + accountTo +
                ", amount=" + amount +
                '}';
    }

    public String toStrings() {
        return "Transfer{" +
                "transfer_id=" + transferId +
                ", transfer_type_id=" + transferTypeId +
                ", transfer_status_id=" + transferStatusId +
                ", account_from=" + accountFrom +
                ", account_to=" + accountTo +
                ", amount=" + amount +
                '}';
    }

}
