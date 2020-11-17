package ge.edu.btu.chat.server;

import ge.edu.btu.chat.shared.Text;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread{

    private Socket clientSocket;
    final private String[] offices = {"ფილიალი 1", "ფილიალი2", "ფილიალი3"};

    public ServerThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            handleClient();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void handleClient() throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());

        while (true){
            Text receivedQuestion = (Text) objectInputStream.readObject();
            switch (receivedQuestion.getText()){
                case "გამარჯობა":
                    objectOutputStream.writeObject(new Text("მოგესალმებით, რით შემიძლია დაგეხმაროთ?"));
                case "მაჩვენე კურსი":
                    objectOutputStream.writeObject(new Text("2,75"));
                case "მაჩვენე ფილიალები":
                    objectOutputStream.writeObject(new Text(offices.toString()));
                case "ნახვამდის":
                    objectOutputStream.writeObject(new Text("გმადლობთ რომ დაგვიკავშირდით, ნახვამდის!"));
                default:
                    objectOutputStream.writeObject(new Text("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს."));
            }
        }

    }
}
