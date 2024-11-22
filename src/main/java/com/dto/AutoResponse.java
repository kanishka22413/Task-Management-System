package com.dto;



public class AutoResponse {

    private final String jwt;

    public AutoResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
