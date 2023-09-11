import schoolManagment.enums.Classes;
import schoolManagment.enums.Religion;
import schoolManagment.enums.Sex;
import schoolManagment.model.*;
import schoolManagment.service.implementation.PrincipalImplementation;
import schoolManagment.service.implementation.StudentImplementation;
import schoolManagment.service.implementation.TeacherImplementation;

public class Main {
    public static void main(String[] args) {
        Course maths = new Course("Mathematics", Classes.JSS1);
        Course eng = new Course("English", Classes.JSS3);
        Course phy = new Course("Physics", Classes.SSS2);
        Principal principal = new Principal("Gideon", 35, "08037658437", "Road 12 irewole estate", Sex.MALE, Religion.CHRISTIANITY, 5485);
        Student student1 = new Student("Ayo", 12, "08177553857", "Oke ijebu road", Sex.MALE, Religion.CHRISTIANITY, 577, Classes.SSS2, maths, 30.7);
        Teacher teacher = new Teacher("Tolu", 35, "09047388476", "Road 2 adeoye street", Sex.FEMALE, Religion.ISLAM, 3444, phy, Classes.SSS2);
        Applicant applicant = new Applicant("Ola", 14, "0705677508", "Number 34, ijola estate", Sex.MALE, Religion.CHRISTIANITY);
        Student student2 = new Student("Sade", 18, "090738263564", "Iyin road ikere", Sex.FEMALE, Religion.CHRISTIANITY, 5959, Classes.SSS1, eng, 49.1);
        Teacher teacher1 = new Teacher("olu", 38, "08036272728", "off afa o road ado", Sex.MALE, Religion.CHRISTIANITY, 4784, eng, Classes.SSS3);

        PrincipalImplementation principalImplementation = new PrincipalImplementation();
        System.out.println(principalImplementation.admitStudent(applicant.getAge()));
        System.out.println(principalImplementation.expelStudent(student1.getStudentGrade()));

        TeacherImplementation teacherImplementation = new TeacherImplementation();
        System.out.println(teacherImplementation.teachStudent(Classes.SSS1, maths.getCourseClass()));
        System.out.println(teacherImplementation.teachStudent(Classes.SSS2, phy.getCourseClass()));

        StudentImplementation studentImplementation = new StudentImplementation();
        System.out.println(studentImplementation.takeCourse(Classes.SSS2, phy.getCourseClass()));
        System.out.println(studentImplementation.takeCourse(Classes.JSS3, maths.getCourseClass()));


    }
}

