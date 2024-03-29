package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.models.User;

@Controller
public class UserController {

    @GetMapping(value = "/user")
    public String user(Model model, @AuthenticationPrincipal User user) {
        model.addAttribute("user", user);
        return "showOneUser";
    }

}
