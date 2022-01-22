package com.example.recyclerview;

public class Friends {


    public Friends( String name, String dob, String city) {
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
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
    private String dob;
    private String city;

}
