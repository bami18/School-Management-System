package schoolManagment.model;

public class School {
    private String schoolName;
    private Student student;
    private Staff staff;
    private String address;
    private double min_grade;
    private int min_age;
    private int max_age;

    public School(String schoolName, Student student, Staff staff, String address, double min_grade, int min_age, int max_age) {
        this.schoolName = schoolName;
        this.student = student;
        this.staff = staff;
        this.address = address;
        this.min_grade = min_grade;
        this.min_age = min_age;
        this.max_age = max_age;
    }

    public School() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMin_grade() {
        return min_grade;
    }

    public void setMin_grade(double min_grade) {
        this.min_grade = min_grade;
    }

    public int getMin_age() {
        return min_age;
    }

    public void setMin_age(int min_age) {
        this.min_age = min_age;
    }

    public int getMax_age() {
        return max_age;
    }

    public void setMax_age(int max_age) {
        this.max_age = max_age;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", student=" + student +
                ", staff=" + staff +
                ", address='" + address + '\'' +
                ", min_grade=" + min_grade +
                ", min_age=" + min_age +
                ", max_age=" + max_age +
                '}';
    }
}
