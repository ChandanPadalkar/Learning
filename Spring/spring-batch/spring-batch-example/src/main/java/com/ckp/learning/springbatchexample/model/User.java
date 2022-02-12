package com.ckp.learning.springbatchexample.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;
    private LocalDateTime time;

    public User() {
    }

    public User(Integer id, String name, String dept, Integer salary, LocalDateTime time) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
