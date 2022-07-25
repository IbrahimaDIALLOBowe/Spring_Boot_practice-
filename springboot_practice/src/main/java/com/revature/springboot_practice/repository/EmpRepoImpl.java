package com.revature.springboot_practice.repository;

import com.revature.springboot_practice.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmpRepoImpl implements IEmpRepo {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Employee getEmployee(int emplId) {
        String query = "select * from employee where id = ?";
        Employee emp = jdbcTemplate.queryForObject(query, new Object[] {emplId}, new EmployeeRowMapper());
        return emp;
    }

    @Override
    public List<Employee> getAllEmployees() {
        String query = "select * from employee";
        List<Employee> employees = jdbcTemplate.query(query, new EmployeeRowMapper());
        return employees;
    }

    @Override
    public int insertEmployee(Employee emp) {
        String query = "insert into employee values (?, ?, ?, ?)";
        int result = jdbcTemplate.update(query, new Object[] {emp.getId(), emp.getName(), emp.getSalary(), emp.getBonus()});
        return result;
    }

    @Override
    public int updateEmployee(Employee emp) {
        String query = "update employee set name = ?, salary = ?, bonus = ? where id = ?";
        int result = jdbcTemplate.update(query, new Object[] {emp.getName(), emp.getSalary(), emp.getBonus(), emp.getId()});
        return result;
    }

    @Override
    public int deleteEmployee(int emplId) {
        String query = "delete from employee where id = ?";
        int result = jdbcTemplate.update(query, new Object[] {emplId});
        return result;
    }


}
