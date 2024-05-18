package com.devteria.identityservice.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserRequest {

    @Size(min = 3, message = "USERNAME_INVALID")
    private String username;

    @Size(min = 8, message = "Password must be at least 8 characters")
    private String password;

    private String firstName;

    private String lastName;

    private LocalDate dob;

}
