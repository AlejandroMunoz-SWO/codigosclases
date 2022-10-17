package com.example.ejercicio2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.ejercicio2.service.Numero;

@Controller
public class NumeroController {
    

    @GetMapping("/random")
    public String senRandom(Model model){

        Numero numero = new Numero();
        
        model.addAttribute("numero", numero.envioNumero());

        return "randomView";
    }




    
}
