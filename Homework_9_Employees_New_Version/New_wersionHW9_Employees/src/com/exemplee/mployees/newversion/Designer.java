package com.exemplee.mployees.newversion;

public class Designer extends Employee {
    public Designer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " is painting pictures.");
    }

    @Override
    public void describeRole() {
        System.out.println("Designer: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary());
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Designer: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary() + ", Info: " + extraInfo);
    }
}

