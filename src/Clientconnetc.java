import java.io.*;
import java.net.Socket;

public class Clientconnetc  {
 public  Socket s;
    public ObjectOutputStream coos;
    public ObjectInputStream cois;

    public void Clientconnetc() throws IOException {
     System.out.println("server connecting....");
                s = new Socket("127.0.0.1",43);
                System.out.println("connection established....");
                coos = new ObjectOutputStream(s.getOutputStream());
                cois = new ObjectInputStream(s.getInputStream());
        }
        public void Closesocket() throws IOException{

            coos.close();//закрытие потока вывода
            cois.close();//закрытие потока ввода
            s.close();//закрытие сокета
        }
}
