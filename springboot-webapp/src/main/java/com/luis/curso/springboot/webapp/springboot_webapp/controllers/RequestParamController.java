package com.luis.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luis.curso.springboot.webapp.springboot_webapp.models.dto.ParamDTO;
import com.luis.curso.springboot.webapp.springboot_webapp.models.dto.ParamMixDTO;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/params")
public class RequestParamController {

    /*
        La notación @RequestParam sirve para extraer parametros de una solicitud HTTP
        como parametros de consulta en la URL.

        Para que funcione, el parametro de la URL debe de llamarse igual que el parametro del método.

        Ejemplo: localhost:8080/api/params/foo?message=hola

        ----------------
        (required = false) : es un parametro utilizado para indicar si es obligatorio pasar un parametro (el default es true)
    */
    @GetMapping("/parametro")
    public ParamDTO parametro(@RequestParam(
        required = false,
        defaultValue = "Mensaje vacio") String message){
        ParamDTO param = new ParamDTO();
        param.setMessage(message);
        return param;
    }

    /*
        Para separar parametros en una URL se utiliza el simbolo de Amperson &

        http://localhost:8080/api/params/parametros?text=hola&code=5
    */
    @GetMapping("/parametros")
    public ParamMixDTO parametros(@RequestParam String text, @RequestParam Integer code){
         ParamMixDTO params = new ParamMixDTO();
         params.setMessage(text);
         params.setCode(code);
         return params;
    }

    /*
        Obtener parametros mediante el objeto HttpServletRequest
    */
    @GetMapping("/request")
    public ParamMixDTO request(HttpServletRequest request){
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch(NumberFormatException e){
        }
        
        ParamMixDTO params = new ParamMixDTO();
        params.setCode(code);
        params.setMessage(request.getParameter("message"));
        return params;
    }
    
}
