package com.miguel.webapp.springboot_web.models.dto;

import com.miguel.webapp.springboot_web.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

  private String title;
  private User user;

}
