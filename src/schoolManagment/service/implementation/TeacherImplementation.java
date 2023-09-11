package schoolManagment.service.implementation;

import schoolManagment.enums.Classes;
import schoolManagment.service.TeacherService;

public class TeacherImplementation implements TeacherService {
    @Override
    public String teachStudent(Classes teacherClass, Classes courseClass) {
        if (teacherClass.equals(courseClass)){
            return "YOU ARE ELIGIBLE TO TEACH THE CLASS";
        }
        return "YOU ARE NOT ELIGIBLE TO TEACH";
    }

}
