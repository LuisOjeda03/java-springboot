package com.luis.curso.springboot.webapp.springboot_webapp.models;

public class User {
    
    private String name;
    private String lastname;
    private String email;

    public User(){
        
    }

    public User(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public User(String name, String lastname, String email){
        this(name, lastname);
        this.email = email;
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

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
