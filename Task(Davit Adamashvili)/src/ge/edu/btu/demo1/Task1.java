package ge.edu.btu.demo1;

import java.util.HashSet;

public class Task1 {
    public static void main(String[] args) {
        var unicNames = new HashSet<String>();
        String[] names = {"name1", "name2","name3","name4"};
        for (String name : names){
            unicNames.add(name);
            System.out.println(name);
        }
    }
}
