package DavitAdamshvili.ge.btu;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.Scanner;
import java.io.FileFilter;

public class Main {

    final static Logger logger=Logger.getLogger(Main.class);

    public static void main(String[] args) {

        File file = new File(
                "C:\\Users\\DATA\\Desktop\\BTU\\2020\\JAVA\\" +
                        "testFiles");
        Scanner scanner = new Scanner(System.in);

        System.out.println("შეიყვანეთ საძიებო სიტყვა: ");
        String keyword = scanner.nextLine();
        logger.info("შემოტანილი სიტყვა: " + keyword);

        File[] fileList = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains(keyword);
            }
        });


        for(File currentFile : fileList){
            logger.info("მოიძებნა : " + currentFile.getName());
        }

    }
}
