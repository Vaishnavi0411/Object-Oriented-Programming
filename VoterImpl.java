package com.niit.voter;
public class VoterImpl {
    public static void main(String[] args) {
        Voter john = new Voter();
        john.setAge(10);
        john.setName("john");
        String info = john.toString();
        System.out.println(info);
        String checkedCriteria = john.getAgeCriteria();
        System.out.println(checkedCriteria);
    }
}
