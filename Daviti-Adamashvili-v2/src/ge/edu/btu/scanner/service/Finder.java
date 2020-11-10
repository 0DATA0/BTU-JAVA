package ge.edu.btu.scanner.service;

import java.io.File;
import java.util.Scanner;

public class Finder {
    File file = new File("C:\\Users\\DATA\\Desktop\\BTU_DOCUMENT");

    public void begin(){
        LogicThread logicThread = new LogicThread();
        logicThread.start();
        find();
    }

    void find(){
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();

        File[] fileList = file.listFiles(pathname -> pathname.getName().contains(keyword));
        if (fileList.length < 1)
            find();
        System.out.println("საძიებო სიტყვა: " + keyword);
        for(File currentFile : fileList){
            System.out.println("მოიძებნა: " + currentFile.getName());
        }
        find();
    }
}
