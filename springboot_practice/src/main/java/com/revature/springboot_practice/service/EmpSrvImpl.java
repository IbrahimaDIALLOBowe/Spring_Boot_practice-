package com.revature.springboot_practice.service;

import com.revature.springboot_practice.pojo.Employee;
import com.revature.springboot_practice.repository.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpSrvImpl implements IEmpSrv {

    @Autowired
    private IEmpRepo empRepo;
    public void setEmpRepo(IEmpRepo empRepo) {
        this.empRepo = empRepo;
    }

    @Override
    public Employee getEmployee(int emplId) {
        Employee emp = empRepo.getEmployee(emplId);
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = empRepo.getAllEmployees();
        return employees;
    }

    @Override
    public String insertEmployee(Employee emp) {
        int result = empRepo.insertEmployee(emp);
        if(result != 0){
            return "Employee insertion success";
        }else{
            return "Employee insertion failure";
        }
    }

    @Override
    public String updateEmployee(Employee emp) {
        int result = empRepo.updateEmployee(emp);
        if(result != 0){
            return "Employee update success";
        }else{
            return "Employee update failure";
        }
    }

    @Override
    public String deleteEmployee(int emplId) {
        int result = empRepo.deleteEmployee(emplId);
        if(result != 0){
            return "Employee deletion success";
        }else{
            return "Employee deletion failure";
        }
    }
}
