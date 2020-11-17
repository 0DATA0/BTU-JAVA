package ge.edu.btu.chat.client;

import ge.edu.btu.chat.shared.Text;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception{
        //1. კლიენტის შექმნა და კავშირზე გასვლა
        Socket socket = new Socket("localhost", 2020);
        System.out.println("კლიენტი შექმნილია და მიმდინარეობს კავშირის დამყარება...");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

        while (true){
            Scanner scanner = new Scanner(System.in);
            String line = scanner.next();
            Text text = new Text(line);
            objectOutputStream.writeObject(text);
            Text receivedText = (Text) objectInputStream.readObject();
            System.out.println(receivedText.getText());
        }

        //objectOutputStream.close();
        //socket.close();
    }
}
