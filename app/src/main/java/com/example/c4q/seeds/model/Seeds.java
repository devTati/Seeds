package com.example.c4q.seeds.model;

/**
 * Created by c4q on 6/21/18.
 */

public class Seeds {

    private String name;
    private String address;
    private String cityAndState;
    private String hours;
    private String requirements;



    public Seeds(String name, String address, String cityAndState, String hours, String requirements) {
        this.name = name;
        this.address = address;
        this.cityAndState = cityAndState;
        this.hours = hours;
        this.requirements = requirements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCityAndState() {
        return cityAndState;
    }

    public void setCityAndState(String cityAndState) {
        this.cityAndState = cityAndState;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }
}
