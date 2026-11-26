package com.luis.curso.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springboot_webapp.models.User;


// Anotación para indicar que es un controlador de Rest en Spring
@RestController   
@RequestMapping("/api") // URL base de los metodos handler
public class UserRestController {

    // @RequestMapping(path = "/details", method = RequestMethod.GET)
    // GetMapping es un atajo a lo de arriba
    @GetMapping("/details") // - /api/details
    public Map<String, Object> details(){
        User user = new User("Luis", "Ojeda");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo desde Spring boot");
        body.put("user", user);
        return body;
    } 
}
