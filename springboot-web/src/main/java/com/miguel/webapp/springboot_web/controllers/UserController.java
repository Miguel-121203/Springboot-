package com.miguel.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

  @GetMapping("/details")
  public String details(Model model){
    model.addAttribute("title","Hola Mundo Spring Boot");
    model.addAttribute("name","Miguel Angel");
    model.addAttribute("lastname","Beltran Bohorquez");
    return "details";
  }

}
