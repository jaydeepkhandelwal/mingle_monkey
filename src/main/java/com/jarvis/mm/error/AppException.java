package com.jarvis.mm.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by jafar.rizvi on 10/09/16.
 */
@AllArgsConstructor
@Getter
public class AppException extends Exception{
    private static final long serialVersionUID = 1L;
    private AppError error;

}
