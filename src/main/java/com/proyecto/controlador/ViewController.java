package com.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
public class ViewController {
    
    
    @GetMapping("/login")
    public String login(){
     
        return "login";
    }
    
    
     @GetMapping("/index")
    public String index() {
        
        return "index"; // Retorna la vista index.html
    }
    
    
     @GetMapping("/principal")
    public String principal() {


        return "principal"; // Retorna la vista otraVista.html
    }
    
    @GetMapping("/error")
public String error() {
    return "error"; // Página de error, si se necesita
}
    
}
