// src/main/java/com/example/controller/ApiController.java
package com.example.controller;
import com.example.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/api")
public class ApiController {
   @Autowired
   private AppService appService;
   @GetMapping("/data")
   public List<String> getData() {
       return appService.getDataFromService();
   }
}
