package ge.edu.btu.demo3;

public class Smartphone {
    static <P extends Smartphone>
    void displaySmartphone(P phone) {
        System.out.println(phone);
    }
}