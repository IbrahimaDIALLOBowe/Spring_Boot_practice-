package com.revature.springboot_practice.controller;

import com.revature.springboot_practice.pojo.Employee;
import com.revature.springboot_practice.pojo.ResponseEntity;
import com.revature.springboot_practice.service.IEmpSrv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/emp")
public class EmployeeController {

    @Autowired
    private IEmpSrv empSrv;
    public void setEmpSrv(IEmpSrv empSrv) {
        this.empSrv = empSrv;
    }

    @RequestMapping(value="/get/{emplId}")
    public Employee getEmployee(@PathVariable int emplId) {

      return empSrv.getEmployee(emplId);
    }

    @GetMapping(value="/all")
    public List<Employee> getAllEmployees(){
        return empSrv.getAllEmployees();
    }

    @PostMapping(value="/action")
    public ResponseEntity insertEmployee(@RequestBody Employee emp) {
        String message = empSrv.insertEmployee(emp);
        ResponseEntity resp = new ResponseEntity(200, message);
        return resp;
    }

    @PutMapping(value="/action")
   public ResponseEntity updateEmployee(@RequestBody Employee emp) {
        String message = empSrv.updateEmployee(emp);
        ResponseEntity resp = new ResponseEntity(200, message);
        return resp;
    }

    @DeleteMapping(value="/action/{emplId}")
    public ResponseEntity deleteEmployee(@PathVariable int emplId){
        String message = empSrv.deleteEmployee(emplId);
        ResponseEntity resp = new ResponseEntity(200, message);
        return resp;
    }

}





