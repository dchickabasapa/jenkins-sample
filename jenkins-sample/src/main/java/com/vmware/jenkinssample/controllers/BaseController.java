package com.vmware.jenkinssample.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BaseController {
  
  @RequestMapping("/")
  public String index() {
    return "Hello World!!!";
  }
}
