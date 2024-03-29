package com.revature.springboot_practice.pojo;


public class Employee {

    private int id;
    private String name;
    private int salary;
    private int bonus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public Employee(){

    }
    public Employee(int id, String name, int salary, int bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
