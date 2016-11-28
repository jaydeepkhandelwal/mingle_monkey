package com.jarvis.mm.error;

import lombok.Getter;
import lombok.ToString;

/**
 *
 * Created by jafar.rizvi on 10/09/16.
 */
@Getter
@ToString
public enum AppError {
    INVALID_INPUT(400, "Invalid Input"),
    UNAUTHORIZED(403, "Un-Authorized"),
    NOT_FOUND(404, "Invalid Input"),
    UNEXPECTED_ERROR(500, "Unexpected Error");

    private String message;
    private Integer code;

    private AppError(int code, String message) {

        this.code = code;
        this.message = message;
    }
}
