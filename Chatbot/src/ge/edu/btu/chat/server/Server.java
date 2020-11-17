package ge.edu.btu.chat.server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
        int port = 2020;
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("სერვერი ჩაირთო და მზადაა კლიენტების მისაღებად...");
        while (true){
            Socket currentSocket = serverSocket.accept();
            System.out.println("მიღებულია ახალი კლიენტი");
            ServerThread thread = new ServerThread(currentSocket);
            thread.start();
        }
    }
}
