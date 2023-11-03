// src/main/java/com/example/service/DataService.java
package com.example.service;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
@Service
public class DataService {
   public List<String> fetchDataFromWebService() {
       // Code to call a web service and return data
       // Example:
       return Arrays.asList("Result 1", "Result 2", "Result 3");
   }
}
