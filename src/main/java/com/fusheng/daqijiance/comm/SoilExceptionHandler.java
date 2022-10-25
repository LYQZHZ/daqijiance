package com.fusheng.daqijiance.comm;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 拦截异常并转换成 自定义ExceptionResponse
 */
@RestControllerAdvice
public class SoilExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Object Exception(Exception ex) {
        ExceptionResponse response =new ExceptionResponse(ex.getMessage());
        return response;
    }

    @ExceptionHandler(SoilException.class)
    public Object Exception(SoilException ex) {
        ExceptionResponse response =new ExceptionResponse(ex.getMessage());
        response.setCode(ex.getCode().getValue());
        return response;
    }
}
