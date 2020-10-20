package DavitAdamshvili.ge.btu;

import org.apache.log4j.Logger;

import java.io.File;
import java.util.Scanner;

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

        String[] fileNameList = file.list();

        for(String fileName : fileNameList){
            if(fileName.contains(keyword)) {
                logger.info("მოიძებნა ფაილი: " + fileName);
            }
        }

    }
}