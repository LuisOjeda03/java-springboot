package com.luis.curso.springboot.webapp.springboot_webapp.models;

public class User {
    
    private String name;
    private String lastname;

    public User(){
        
    }

    public User(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastname(){
        return this.lastname;
    }

    public void setLastname(String lastName){
        this.lastname = lastName;
    }
}
