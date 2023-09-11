package schoolManagment.model;

import schoolManagment.enums.Religion;
import schoolManagment.enums.Sex;

public class Staff extends Person{
    private int IdNumber;

    public Staff(String name, int age, String phoneNumber, String address, Sex sex, Religion religion, int idNumber) {
        super(name, age, phoneNumber, address, sex, religion);
        IdNumber = idNumber;
    }

    public Staff(int idNumber) {
        IdNumber = idNumber;
    }
}
