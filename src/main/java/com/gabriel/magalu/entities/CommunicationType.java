package com.gabriel.magalu.entities;

public enum CommunicationType {
    EMAIL("email"),
    SMS("sms"),
    PUSH("push"),
    WHATSAPP("whatsapp");

    private String description;

    CommunicationType(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
