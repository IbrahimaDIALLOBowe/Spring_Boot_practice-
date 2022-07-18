package com.revature.springboot_practice.controller;

import com.revature.springboot_practice.pojo.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/emp")
public class EmployeeController {

    @RequestMapping(value="/get")
    public Employee getEmployee(){
        return new Employee(10, "nacer", 9000, 900);
    }

}
