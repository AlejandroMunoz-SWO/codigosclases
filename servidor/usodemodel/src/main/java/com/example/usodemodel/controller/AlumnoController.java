package com.example.usodemodel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.usodemodel.model.Alumno;

@Controller
public class AlumnoController {

    @GetMapping("/home")
    public String ejemplo(Model model){

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno(1, "Juan"));
        alumnos.add(new Alumno(2, "Pedro"));

        model.addAttribute("alumnos", alumnos);

        return "home";
    }
    
}
