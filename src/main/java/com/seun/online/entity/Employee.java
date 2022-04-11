package com.seun.online.entity;

import javax.persistence.*;

@Entity
@Table(name = "emp_tbl")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "emp_id")
    private int id;
    @Column(name = "emp_name")
    private String name;
    @Column(name = "emp_skillset")
    private String skillSet;
    @Column(name = "emp_email")
    private String email;

    public Employee() {
        super();
    }

    public Employee(String name, String skillSet, String email) {
        super();
        this.name = name;
        this.skillSet = skillSet;
        this.email = email;
    }

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

    public String getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
