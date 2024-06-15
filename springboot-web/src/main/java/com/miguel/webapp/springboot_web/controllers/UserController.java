package com.miguel.webapp.springboot_web.controllers;

import com.miguel.webapp.springboot_web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model) {

    User user = new User("Miguel Angel", "Beltran Bohorquez");
    model.addAttribute("title", "Hola Mundo Spring Boot");
    model.addAttribute("user", user);
    return "details";
  }

}
