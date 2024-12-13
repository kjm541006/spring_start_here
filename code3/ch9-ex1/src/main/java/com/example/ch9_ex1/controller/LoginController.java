package com.example.ch9_ex1.controller;

import com.example.ch9_ex1.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

    private final LoginProcessor loginProcessor;

    public LoginController(LoginProcessor loginProcessor) {
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String loginGet(){
        return "login.html";
    }

    @PostMapping("/")
    public String loginPost(@RequestParam String username, String password, Model model, RedirectAttributes redirectAttributes){

        boolean loggedIn = false;

        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);

        loggedIn = loginProcessor.login();

        if(loggedIn){
            redirectAttributes.addFlashAttribute("message", "Logged In");
        }else{
            redirectAttributes.addFlashAttribute("message", "Login failed");
        }

        return "redirect:/";
    }
}
