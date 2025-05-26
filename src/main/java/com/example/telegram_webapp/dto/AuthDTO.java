package com.example.telegram_webapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthDTO {


    private Long id;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    private String username;

    @JsonProperty("photo_url")
    private String photoUrl;

    @JsonProperty("auth_date")
    private Long authDate;

    private String hash;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public Long getAuthDate() {
        return authDate;
    }

    public String getHash() {
        return hash;
    }
}
