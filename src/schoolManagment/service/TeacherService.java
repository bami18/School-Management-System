package schoolManagment.service;

import schoolManagment.enums.Classes;

public interface TeacherService {
    String teachStudent(Classes teacherClass, Classes courseClass);
}
