package com.gabriel.magalu.entities;

public enum Status {
    PENDING("pending"),
    SUCCESS("success"),
    ERROR("error"),
    CANCELED("canceled");

    private String description;

    Status(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
