package com.revature.springboot_practice.pojo;

public class ResponseEntity {

    private int statusCode;
    private Object message;

    public ResponseEntity(){

    }

    public ResponseEntity(int statusCode, Object message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "statusCode=" + statusCode +
                ", message=" + message +
                '}';
    }
}
