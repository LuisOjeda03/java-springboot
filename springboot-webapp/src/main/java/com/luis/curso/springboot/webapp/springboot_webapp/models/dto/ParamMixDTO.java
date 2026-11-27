package com.luis.curso.springboot.webapp.springboot_webapp.models.dto;

public class ParamMixDTO {

    private String message;
    private Integer code;

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public Integer getCode(){
        return this.code;
    }

    public void setCode(Integer code){
        this.code = code;
    }
    
}
