package schoolManagment.model;


import schoolManagment.enums.Classes;
import schoolManagment.enums.Religion;
import schoolManagment.enums.Sex;
import schoolManagment.model.Course;

import java.util.ArrayList;

public class Student extends Person{
    private int idNumber;
    private Classes classes;
    private Course course;
    private double studentGrade;
//    ArrayList<Student> studentsList = new ArrayList<>();

    public Student(String name, int age, String phoneNumber, String address, Sex sex, Religion religion, int idNumber, Classes classes, Course course, double studentGrade) {
        super(name, age, phoneNumber, address, sex, religion);
        this.idNumber = idNumber;
        this.classes = classes;
        this.course = course;
        this.studentGrade = studentGrade;
//        this.studentsList = studentsList;
    }

    public Student(int idNumber, Classes classes, Course course, double studentGrade) {
        this.idNumber = idNumber;
        this.classes = classes;
        this.course = course;
        this.studentGrade = studentGrade;
//        this.studentsList = studentsList;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(double studentGrade) {
        this.studentGrade = studentGrade;
    }
//
//    public ArrayList<Student> getStudentsList() {
//        return studentsList;
//    }

//    public void setStudentsList(ArrayList<Student> studentsList) {
//        this.studentsList = studentsList;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumber=" + idNumber +
                ", classes=" + classes +
                ", course=" + course +
                ", studentGrade=" + studentGrade +
//                ", studentsList=" + studentsList +
                '}';
    }
}
