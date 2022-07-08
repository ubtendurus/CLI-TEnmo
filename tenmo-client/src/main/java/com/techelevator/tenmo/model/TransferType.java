package com.techelevator.tenmo.model;

public class TransferType {

    private int transferTypeId;
    private String transferType;


    public TransferType(int transferTypeId, String transferType) {
        this.transferTypeId = transferTypeId;
        this.transferType = transferType;
    }

    public TransferType() {
    }

    public int getTransferTypeId() {
        return transferTypeId;
    }

    public void setTransferTypeId(int transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }
}
