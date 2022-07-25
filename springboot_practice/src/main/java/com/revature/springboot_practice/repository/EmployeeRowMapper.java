package com.revature.springboot_practice.repository;

import com.revature.springboot_practice.pojo.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

        Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
        return emp;

    }
}
