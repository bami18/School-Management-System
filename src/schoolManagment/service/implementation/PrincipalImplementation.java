package schoolManagment.service.implementation;

import schoolManagment.model.School;
import schoolManagment.service.PrincipalService;

import java.util.concurrent.RecursiveTask;

public class PrincipalImplementation implements PrincipalService {
    @Override
    public String admitStudent(int age) {
        School school = new School();
        school.setMin_age(12);
        school.setMax_age(20);
        if (age < school.getMin_age() || age > school.getMax_age()){
            return "SORRY YOU'RE NOT ADMITTED";
        }
        return  "CONGRATULATIONS!!! YOU ARE ADMITTED";
    }

    @Override
    public String expelStudent(double grade) {
     School school = new School();
     school.setMin_grade(50);
     if (grade < school.getMin_grade()){
         return "YOU'RE A DULLARD";
     }
     return "YOU HAVE BEEN PROMOTED";
    }
}
