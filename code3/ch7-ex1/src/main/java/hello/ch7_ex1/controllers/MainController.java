package hello.ch7_ex1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home/{color}")
    public String home(Model model, @RequestParam(required = false, defaultValue = "User") String username, @PathVariable String color){
        model.addAttribute("username", username);
        model.addAttribute("color", color);
        return "home.html";
    }
}
