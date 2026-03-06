package org.khadri.spring.core.driver;

public class Student {

    private int id;
    private String name;
    private String branch;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void display() {
        System.out.println("Registered Successfully");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Branch : " + branch);
    }
}