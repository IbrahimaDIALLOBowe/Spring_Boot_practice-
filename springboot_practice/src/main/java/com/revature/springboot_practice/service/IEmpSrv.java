package com.revature.springboot_practice.service;

import com.revature.springboot_practice.pojo.Employee;

import java.util.List;

public interface IEmpSrv {

    Employee getEmployee(int emplId);
    List<Employee> getAllEmployees();

    String insertEmployee(Employee emp);

    String updateEmployee(Employee emp);

    String deleteEmployee(int emplId);

}
