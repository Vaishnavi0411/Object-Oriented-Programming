package com.niit.studentsgrade;
public class StudentsMarks {

    public int calculateMarks(int math, int physics, int chemistry, int biology){
        int sum = math + physics + chemistry + biology;
        return sum;
    }

    public int calculateMarks(int sub1, int sub2, int sub3){
        int sum = sub1 + sub2 + sub3;
        return sum;
    }

}
