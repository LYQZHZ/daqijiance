package com.fusheng.daqijiance.comm;

public class ExceptionResponse {
    private String message;
    private int code;
    public ExceptionResponse(String message){
        this.message = message;
        this.code = ExceptionCode.UNKNOWN_ERROR.getValue();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
