package com.luis.curso.springboot.webapp.springboot_webapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springboot_webapp.models.User;
import com.luis.curso.springboot.webapp.springboot_webapp.models.dto.ParamDTO;

@RestController
@RequestMapping("/api/var") 
public class PathVariableController {
    
    @GetMapping("/baz/{message}")
    public ParamDTO baz(@PathVariable String message){
        
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mixPathVariable(@PathVariable String product, @PathVariable Long id){

        Map<String, Object> json = new HashMap<>();
        json.put("product", product );
        json.put("id", id);

        return json;
    }

    /*
        PostMapping
    */
   @PostMapping("/create")
   public User createUser(@RequestBody User user){
        // Hacer algo con el usuario 
        return user;
   }

}
