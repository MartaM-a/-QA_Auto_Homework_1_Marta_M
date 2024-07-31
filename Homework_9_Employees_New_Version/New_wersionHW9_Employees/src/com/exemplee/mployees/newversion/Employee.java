package com.exemplee.mployees.newversion;

public class Employee {


    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void work () {
            System.out.println(name + " is working.");
        }
        public void takeBreak () {
            System.out.println(name + " is taking a break.");
        }

        public void performJob () {
            System.out.println(name + " is performing job.");
        }

        public void describeRole () {
            System.out.println("Employee: " + name + ", Age: " + age + ", Salary: " + salary);
        }

        public void describeRole (String extraInfo){
            System.out.println("Employee: " + name + ", Age: " + age + ", Salary: " + salary + ", Info: " + extraInfo);
        }

    }



