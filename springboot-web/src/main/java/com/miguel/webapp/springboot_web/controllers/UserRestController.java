package com.miguel.webapp.springboot_web.controllers;

import com.miguel.webapp.springboot_web.models.User;
import com.miguel.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserRestController {

  //aca trabajaremos con DTO
  @GetMapping("/details")
  public UserDto details() {

    UserDto userDto = new UserDto();
    User user = new User("Miguel Angel", "Beltran Bohorquez");
    userDto.setUser(user);
    userDto.setTitle("Hola mundo Spring Boot");
    return userDto;
    
  }

// Ejemplo con map para transferencia de datos
//  @GetMapping("/details")
//  public Map<String, Object> details() {
//
//    User user = new User("Miguel Angel", "Beltran Bohorquez");
//    Map<String, Object> body = new HashMap<>();
//
//    body.put("title", "Hola Mundo Spring Boot");
//    body.put("user", user);
//    return body;
//  }

}
