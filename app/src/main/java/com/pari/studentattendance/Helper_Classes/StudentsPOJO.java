package com.pari.studentattendance.Helper_Classes;

public class StudentsPOJO {
    private String name, standard, phone;

    public StudentsPOJO(String name, String standard, String phone) {
        this.name = name;
        this.standard = standard;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
