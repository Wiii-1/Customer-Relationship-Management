package com.aurora_technologies.crm3.models;

public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private String role;

    public RegisterRequest(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }
    // getters and setters (optional, for Gson)
}
