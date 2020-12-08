package ge.edu.btu.demo2;

public class Task2 {
    public static void main(String[] args) {
        Summable sumUp = (x,y) -> x+y;
        var sum = sumUp.sum(5,102);
        System.out.println(sum);
    }
}
