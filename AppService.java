// src/main/java/com/example/service/AppService.java
package com.example.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class AppService {
   @Autowired
   private DataService dataService;
   public List<String> getDataFromService() {
       return dataService.fetchDataFromWebService();
   }
}
