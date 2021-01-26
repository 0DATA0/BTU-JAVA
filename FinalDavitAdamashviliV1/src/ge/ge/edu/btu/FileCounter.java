package ge.ge.edu.btu;

import java.io.File;
import java.io.FileFilter;

public class FileCounter {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\DATA\\Desktop\\BTU\\2020\\JAVA\\Final files\\BTU_DOCUMENTS\\BTU_DOCUMENTS");

        File[] fileList = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().contains("btu");
            }
        });
        System.out.println("დირექტორია: " + file + "\nმოიძებნა " + fileList.length + " ფაილი");
    }
}