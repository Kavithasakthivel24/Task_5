package Qno4;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrade {

    HashMap<String,Integer> map = new HashMap<>();

    void addStudent(String name, int grade) {
        map.put(name, grade);
    }

    void removeStudent(String name) {
        map.remove(name);
    }

    void displayGrade(String name) {
        if(map.containsKey(name))
            System.out.println("Grade: "+map.get(name));
        else
            System.out.println("Student not found");
    }

    public static void main(String[] args) {

        StudentGrade obj = new StudentGrade();

        obj.addStudent("Ravi",85);
        obj.addStudent("Priya",92);

        obj.displayGrade("Priya");
        obj.removeStudent("Ravi");
    }
}