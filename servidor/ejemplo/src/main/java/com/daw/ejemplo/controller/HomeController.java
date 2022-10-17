package com.daw.ejemplo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.daw.clases.Empleado;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){

        List<Empleado> empleados = new ArrayList<>();

        Empleado empleado1 = new Empleado(1, "Pedro");
        Empleado empleado2 = new Empleado(2, "Sara");

        empleados.add(empleado1);
        empleados.add(empleado2);

        model.addAttribute("empleados", empleados);

        return "home";
    }
    
}
