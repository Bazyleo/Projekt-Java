package com.company;

import java.util.*;

public class Student {
    private final String surname;
    int sum = 0;
    int count = 0;


    private final List<Ratings> grades;

    public static LinkedHashMap<String, Double> journal = new LinkedHashMap<>();


    public void getGrade(Ratings grade)
    {
        grades.add(grade);
    }

    public Student(String surname) {
        this.surname = surname;
        grades = new ArrayList<>();
        journal.put(surname, avg());
    }




    public void showJournal() {
        System.out.println("Surname is: " + surname);

    }


    public double avg() {

        for (Ratings grade : grades) {
            sum += grade.grade;
        }
        return (double) sum / grades.size();
    }


    public void studentAVG(String r) {

        for (Ratings grade : grades)
        {
            if (r.equals(surname))

            {
                sum += grade.grade;
                count++;
            }

            System.out.println("Average is " + (double) sum / count);
        }
    }

    public String getSurname()
    {
        return surname;
    }




}