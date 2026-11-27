package com.luis.curso.springboot.webapp.springboot_webapp.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Inyección de dependencia para pasar datos a la vista
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.luis.curso.springboot.webapp.springboot_webapp.models.User;


// Anotación para indicar que es un controlador de Spring
@Controller 
public class UserController {
    /*
        Los métodos dentro de un controlador contendrá métodos Handler,

        --- Métodos Handler ---
        Los métodos handler son todos aquellos metodos que se encuentran dentro de la clase
        de controlador cuyo objetivo es obtener un request y dar una respuesta, manejan las
        pediciones HTTP.*/



    /*
        Supongamos que este método es llamado para regresar una plantilla HTML, 
        en este caso regresa en String el nombre de la plantilla SIN SU EXTENSIÓN.
    */

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Luis", "Ojeda");
        user.setEmail("luis@gmail.com");
        model.addAttribute("title", "Hola mundo desde Spring boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

    /*
        Lo que retorna este metodo se guarda en "users"
        en todos los metodos del controlador.    
    */
    @ModelAttribute("users")
    public List<User> usersModel(){
        
        User user1 = new User("Luis", "Ojeda", "luis@gmail.com");
        User user2 = new User("Enrique", "López", "enlo@gmail.com");
        User user3 = new User("José", "Montes");
        
        List<User> users = new ArrayList<>(Arrays.asList(user1, user2, user3));

        return users;
    }
    
}
