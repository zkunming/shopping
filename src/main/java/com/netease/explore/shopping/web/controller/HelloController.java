package com.netease.explore.shopping.web.controller;

import com.netease.explore.shopping.domain.User;
import com.netease.explore.shopping.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello";
  }

  @Autowired
  private UserService userService;

  @RequestMapping("/getUser")
  public User getUser(@RequestParam String id) {
    return userService.findById("1");
  }
}
