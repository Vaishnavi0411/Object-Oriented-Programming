package com.niit.voter;

public class Voter {
    private String name;
    private int age;
    static final int voterEligibleAge = 18;

    //No-argument constructor
    public Voter() {
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

    public String getAgeCriteria(){
        if(getAge() < 0)
            return "Age can't be Negative or Zero";
        else if (getAge() > 0 && getAge() <= voterEligibleAge)
            return getName() + " is not Eligible to Vote";
        else
            return getName() + " is Eligible to Vote";
    }

    @Override
    public String toString() {
        return "Voter{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
