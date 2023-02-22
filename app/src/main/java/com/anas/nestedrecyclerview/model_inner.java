package com.anas.nestedrecyclerview;

public class model_inner {

    String Name,Cost;

    public model_inner(String name, String cost) {
        Name = name;
        Cost = cost;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCost() {
        return Cost;
    }

    public void setCost(String cost) {
        Cost = cost;
    }
}
