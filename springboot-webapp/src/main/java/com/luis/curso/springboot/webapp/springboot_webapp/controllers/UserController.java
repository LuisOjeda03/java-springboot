package com.luis.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Inyección de dependencia para pasar datos a la vista
import org.springframework.web.bind.annotation.GetMapping;

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

        model.addAttribute("title", "Hola mundo desde Spring boot");
        model.addAttribute("user", user);

        return "details";
    }
    
}
