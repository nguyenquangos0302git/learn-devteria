package com.devteria.identityservice.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserResponse {

    private String username;

    private String firstName;

    private String lastName;

    private LocalDate dob;

}
