package TabletsOfStone;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SrvTabletsOfStone {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello to Tablets of Stone Server!");

        // MsgTabletsOfStone m1 = new MsgTabletsOfStone(13, "First Message");
        // MsgTabletsOfStone m2 = new MsgTabletsOfStone(14, "Miau!");
        // System.out.println(m1.getType());
        // System.out.println(m1);

        // System.out.println(m2.getType());
        // System.out.println(m2);   
        
        // System.out.println(MsgTabletsOfStone.getPort());

        ServerSocket srvSocket = new ServerSocket(5025);

        while(true) {
            Socket socket = srvSocket.accept();
            
            try {
                System.out.println("Got a connection");

                InputStream inStream = socket.getInputStream();
                ObjectInputStream objInStream = new ObjectInputStream(inStream);

                MsgTabletsOfStone inMessage = (MsgTabletsOfStone)objInStream.readObject();
                System.out.println(inMessage);
                MsgTabletsOfStone outMessage = new MsgTabletsOfStone(0, "OK");

                OutputStream outStream = socket.getOutputStream();
                ObjectOutputStream objOutStream = new ObjectOutputStream(outStream);
                objOutStream.writeObject(outMessage);
            } catch(Exception e) {
                System.out.printf("Exception!! %s\n", e.getMessage());
            }

            socket.close();
        }
    }
}
