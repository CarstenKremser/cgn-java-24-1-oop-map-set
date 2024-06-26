package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("a001","Ansgar", "Apfel"));
        students.add(new Student("b001","Berta","Brandt"));
        students.add(new Student("c001","Claudia","Cactus"));
        students.add(new Student("d001","Dora","Dingsda"));
        students.add(new Student("e001","Ernst","Einhorn"));

        for(Student student:students) {
            System.out.println(student);
        }


        School school = new School();
        for (Student student:students) {
            school.addStudent(student);
        }
        System.out.println(school);

        Student aStudent = school.findById("d001");
        System.out.println(aStudent);

        school.removeStudent("b001");
        System.out.println(school);

        Course course1 = new Course("english","Smith","A21");
        Course course2 = new Course("math","Meier","B52");
        Course course3 = new Course("french","Müller","A33");
        Course course4 = new Course("physics","Schmidt","B14");

        aStudent.addCourse(course2);
        aStudent.addCourse(course3);
        aStudent.addCourse(course4);

        aStudent = school.findById("c001");
        aStudent.addCourse(course1);
        aStudent.addCourse(course4);

        aStudent = school.findById("a001");
        aStudent.addCourse(course2);
        aStudent.addCourse(course3);

        System.out.println(school.retrieveAllCoursesForStudent("c001"));

        Pharmacy pharmacy = new Pharmacy();

        pharmacy.save(new Medication("ASS",2.34,40));
        pharmacy.save(new Medication("Paracetamol",2.83,30));
        pharmacy.save(new Medication("Bepanthen",8.13,25));

        System.out.println(pharmacy);
    }
}