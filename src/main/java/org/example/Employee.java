package org.example;

public class Employee {
    private static final int CURRENT_YEAR = 2022;
    String name;
    String midName;
    String surName;
    String position;
    String phone;
    int salary;
    int birth;
    char gender;

        public Employee(String name, String midName, String surName, String phone, String position, int salary, int birth, char gender) {
                this.name = name;
                this.midName = midName;
                this.surName = surName;
                this.position = position;
                this.phone = phone;
                this.salary = salary;
                this.birth = birth;
                this.gender = gender;
            }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
        }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", midName='" + midName + '\'' +
                ", surName='" + surName + '\'' +
                ", position='" + position + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(int amount) {
        this.salary += amount;
    }
}
