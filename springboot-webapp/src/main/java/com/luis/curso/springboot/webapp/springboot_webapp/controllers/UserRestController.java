package com.luis.curso.springboot.webapp.springboot_webapp.controllers;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springboot_webapp.models.User;
import com.luis.curso.springboot.webapp.springboot_webapp.models.dto.UserDTO;


// Anotación para indicar que es un controlador de Rest en Spring
@RestController   
@RequestMapping("/api") // URL base de los metodos handler
public class UserRestController {

    @GetMapping("/details") // - /api/details
    public UserDTO details(){
        User user = new User("Luis", "Ojeda");
        UserDTO userDTO = new UserDTO();
        userDTO.setUser(user);
        userDTO.setTitle("Hola mundo desde Spring boot");
        return userDTO;
    } 

    @GetMapping("/list")
    public List<User> list(){

        User user1 = new User("Luis", "Ojeda");
        User user2 = new User("Enrique", "López");
        User user3 = new User("José", "Montes");

        List<User> users = Arrays.asList(user1, user2, user3);

        // List<User> users = new ArrayList<>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);

        return users;
    }

    // @RequestMapping(path = "/details", method = RequestMethod.GET)
    // GetMapping es un atajo a lo de arriba
    @GetMapping("/details-map") // - /api/details
    public Map<String, Object> detailsMap(){
        User user = new User("Luis", "Ojeda");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola mundo desde Spring boot");
        body.put("user", user);
        return body;
    } 
}
