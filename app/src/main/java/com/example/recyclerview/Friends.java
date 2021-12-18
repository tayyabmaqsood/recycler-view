package com.example.recyclerview;

public class Friends {
    public Friends(int id, String name, String dob, String city) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.city = city;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setCity(String city) {
        this.city = city;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getCity() {
        return city;
    }



    @Override
    public String toString() {
        return "Friends{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    private int id;
    private String name;
    private String dob;
    private String city;
}
