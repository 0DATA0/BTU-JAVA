package ge.edu.btu.scanner.service;
import java.io.*;

class LogicThread extends Thread{
    private File file = new File("C:\\Users\\DATA\\Desktop\\BTU_DOCUMENT");
    @Override
    public void run() {
        while(true) {
            System.out.println("ფაილების რაოდენობა დირექტორიაში: "
                    + file.listFiles().length);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}