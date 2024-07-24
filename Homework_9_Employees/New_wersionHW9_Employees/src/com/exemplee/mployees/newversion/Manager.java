package com.exemplee.mployees.newversion;

public class Manager extends Employee {
    public Manager(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " is head of everything.");
    }

    @Override
    public void describeRole() {
        System.out.println("Manager: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary());
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Manager: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary() + ", Info: " + extraInfo);
    }
}

