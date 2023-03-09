package com.snsystems.metrics;

import com.snsystems.metrics.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

   private static final List<Employee> DB = new ArrayList<>();
   static {
      DB.add(new Employee("1", "Frodo", "ring bearer"));
      DB.add(new Employee("2", "Bilbo", "burglar"));
   }

   @GetMapping("/api/employees")
   List<Employee> all() {
      return DB;
   }

   @GetMapping("/api/employees/{id}")
   Employee one(@PathVariable String id) {
      return DB.stream() //
            .filter(employee -> employee.getId().equals(id)) //
            .findFirst() //
            .orElseThrow(() -> new RuntimeException("Couldn't find " + id));
   }
}
