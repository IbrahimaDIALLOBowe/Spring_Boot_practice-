package com.revature.springboot_practice.repository;

import com.revature.springboot_practice.pojo.Employee;

import java.util.List;

public interface IEmpRepo {

    Employee getEmployee(int emplId);

    List<Employee> getAllEmployees();

    int insertEmployee(Employee emp);

    int updateEmployee(Employee emp);

    int deleteEmployee(int emplId);

}
