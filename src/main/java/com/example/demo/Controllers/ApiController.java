package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
 String str="KARTHIKEYAN";
	
 @GetMapping("/")
 public String getName()
 {
  return "Welcome "+str+" !";
 }
  
}