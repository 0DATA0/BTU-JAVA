package ge.edu.btu.demo3;

import ge.edu.btu.demo3.phones.Nokia;
import ge.edu.btu.demo3.phones.SamsungNote;

public class Task3 {
    public static void main(String[] args) {
        Smartphone smartphone = new SamsungNote();
        Symbian symbianPhone = new Nokia();
        Smartphone.displaySmartphone(smartphone);
        Symbian.displaySymbian(symbianPhone);
    }
}