package schoolManagment.service.implementation;

import schoolManagment.enums.Classes;
import schoolManagment.service.StudentService;

public class StudentImplementation implements StudentService {
    @Override
    public String takeCourse(Classes studentClass, Classes courseClass) {
        if (studentClass.equals(courseClass)){
            return "YOU ARE PERMITTED TO TAKE THE CLASS";
        }
        return "GET THE FUCK OUT";
    }
}
