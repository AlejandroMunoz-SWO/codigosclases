package com.example.democookies.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.democookies.services.DeleteCookieService;

@Controller
public class DeleteCookieController {

    @Autowired
    private DeleteCookieService deleteCookieService;

    @GetMapping("/delete-cookie")
    public String deleteCookie(HttpServletResponse response){
        deleteCookieService.deleteCookie(response, "userauth");
        return "redirect:/login";
    }
    
}
