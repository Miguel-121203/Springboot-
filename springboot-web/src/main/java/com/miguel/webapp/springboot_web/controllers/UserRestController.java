package com.miguel.webapp.springboot_web.controllers;

import com.miguel.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> details() {

    User user = new User("Miguel Angel", "Beltran Bohorquez");
    Map<String, Object> body = new HashMap<>();

    body.put("title", "Hola Mundo Spring Boot");
    body.put("user", user);
    return body;
  }

}
