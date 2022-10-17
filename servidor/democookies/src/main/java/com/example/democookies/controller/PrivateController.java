package com.example.democookies.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/private")
public class PrivateController {

    private static final Logger LOG = LoggerFactory.getLogger(PrivateController.class);

    @GetMapping("/home")
    public String home(HttpSession session, Model model, HttpServletRequest request){

       Cookie[] cookies =   request.getCookies();

       boolean auth = false;

       if(cookies != null){
        for(Cookie cookie: cookies){
            if(cookie.getName().equals("userauth")){
                auth = true;
            }
         }
       }
  
       if(auth){
        model.addAttribute("user", session.getAttribute("user"));
        return "home";
       }
       return "redirect:/errores/auth-error";

    }
    
}
