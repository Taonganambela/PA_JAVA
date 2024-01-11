package com.zmltd.pending.pojos;

public class ReponsePojo {

    private Integer statusCode;
    private Object message;

    public ReponsePojo() {

    }

    public ReponsePojo(Integer statusCode, Object message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
