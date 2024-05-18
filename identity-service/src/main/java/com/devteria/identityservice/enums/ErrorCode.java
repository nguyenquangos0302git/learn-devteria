package com.devteria.identityservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    UNKNOW_EXCEPTION(9999, "Unknow exception"),
    USER_EXISTS(1000, "User exception"),
    USERNAME_INVALID(1001, "Username must be at least 3 characters")
    ;

    private int code;
    private String message;

}
