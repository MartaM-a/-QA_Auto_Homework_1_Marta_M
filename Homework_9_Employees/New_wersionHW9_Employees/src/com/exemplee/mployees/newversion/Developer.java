package com.exemplee.mployees.newversion;

public class Developer extends Employee {
    public Developer(String name, int age, int salary) {
        super(name, age, salary);
    }

    @Override
    public void performJob() {
        System.out.println(getName() + " sitting in the computer.");
    }

    @Override
    public void describeRole() {
        System.out.println("Developer: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary());
    }

    @Override
    public void describeRole(String extraInfo) {
        System.out.println("Developer: " + getName() + ", Age: " + getAge() + ", Salary: " + getSalary() + ", Info: " + extraInfo);
        {
        }
    }
}