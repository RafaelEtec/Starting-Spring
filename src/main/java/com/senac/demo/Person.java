package com.senac.demo;

public class Person {
    private String name, email, celNum, birthDate, pass, desc, gender, interests[];
    private int num;
    private double weight, height;

    public Person(String name, String email, String celNum, String birthDate, String pass, String desc, String gender, String[] interests, int num, double weight, double height) {
        this.name = name;
        this.email = email;
        this.celNum = celNum;
        this.birthDate = birthDate;
        this.pass = pass;
        this.desc = desc;
        this.gender = gender;
        this.interests = interests;
        this.num = num;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelNum() {
        return celNum;
    }

    public void setCelNum(String celNum) {
        this.celNum = celNum;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}