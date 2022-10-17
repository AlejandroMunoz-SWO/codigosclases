package com.example.clasemiercoles.controller;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private")
public class PrivateController {

    @GetMapping("/home")
    public String home(HttpSession session){

        System.out.println(session.getAttribute("user"));

        if(session.getAttribute("user") == null){
            return "redirect:/errores/auth-error";
        }


        return "private/home";
    }

    @GetMapping("/delete-session")
    public String deleteSession(HttpSession session){

        session.invalidate();
        return "deleteSession";
    }
    
}
