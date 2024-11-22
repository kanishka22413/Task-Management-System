package com.enums;


public enum TaskServer {

    PENDING("PENDING"),
    ASSIGNED("ASSIGNED"),
    DONE("DONE");

    private final String status;

    TaskStatus(String status){
    this.status=status;
    }

    @Override
    public String toString() {
        return this.status;
        /*final StringBuilder sb = new StringBuilder("TaskStatus{");
        sb.append("status='").append(status).append('\'');
        sb.append('}');
        return sb.toString();*/
    }

}
