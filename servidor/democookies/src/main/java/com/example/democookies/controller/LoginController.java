package com.example.democookies.controller;

import javax.annotation.PostConstruct;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class LoginController {

    private static final Logger LOG = LoggerFactory.getLogger(PrivateController.class);

    @GetMapping("/login")
    public String loginForm(HttpServletRequest request){

        Cookie[] cookies= request.getCookies();

        if(cookies != null){
            for(Cookie cookie: cookies){
                if(cookie.getName().equals("userauth")){
                    return "redirect:/private/home";
    
                }
            }

        }

        return "loginForm";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, 
    @RequestParam String password, RedirectAttributes flash, 
    HttpSession session, Model model, HttpServletResponse response){

        //LOG.info("Username " + username + " Password " + password)


        if(username.equals("Luis") && password.equals("1234")){

            Cookie cookie = new Cookie("userauth", username);

            cookie.setMaxAge(3600);

            response.addCookie(cookie);

            flash.addFlashAttribute("success", "Usuario válido");
            session.setAttribute("user", username);

            return "redirect:/private/home";
        }
        flash.addFlashAttribute("errorlogin", "Usuario no válido");
        return "redirect:/errores/auth-error";
       
    }


}