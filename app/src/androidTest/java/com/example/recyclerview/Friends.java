package com.example.recyclerview;

public class Friends {


    public Friends(int id, String name, int dob, int city) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.city = city;
    }
    public Friends(String name, int dob, int city) {
        this.name = name;
        this.dob = dob;
        this.city = city;
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

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    @Override
    public String toString(){
        return "Friends{"+ "id = "+id+
                " name = "+name+
                " DOB = "+dob+
                " city = "+city;
    }
    private int id;
    private String name;
    private int dob;
    private int city;

}
