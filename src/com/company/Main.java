package com.company;

import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) {


        Student first = new Student("Andrzejowski");
        Student second = new Student("Cegłowski");
        Student third = new Student("Saparowski");

        List<Student> addToList = new ArrayList<>();

        addToList.add(first);
        addToList.add(second);
        addToList.add(third);


        Ratings g1 = new Ratings(3);
        Ratings g2 = new Ratings(4);
        Ratings g3 = new Ratings(5);


first.getGrade(g3);
first.getGrade(g1);
        first.showJournal();




        for(Student r : addToList)
        {
            r.studentAVG(r.getSurname());
        }

    }
}