package schoolManagment.model;

import schoolManagment.enums.Classes;

public class Course {
    private String courseName;
    private Classes courseClass;

    public Course(String courseName, Classes studentClass) {
        this.courseName = courseName;
        this.courseClass = studentClass;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Classes getCourseClass() {
        return courseClass;
    }

    public void setCourseClass(Classes courseClass) {
        this.courseClass = courseClass;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseClass=" + courseClass +
                '}';
    }
}
