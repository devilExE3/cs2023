package TabletsOfStone;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class CliTabletsOfStone {

    private static final String _SERVER_ADDRESS = "192.168.5.157";
    private static final int _SERVER_PORT = 5025;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Hello to Tablets of Stone Client!");
        System.out.println("Connecting");
        Socket socket = new Socket(_SERVER_ADDRESS, _SERVER_PORT);
        System.out.println("Connected");

        OutputStream outStr = socket.getOutputStream();
        ObjectOutputStream objOutStream = new ObjectOutputStream(outStr);

        MsgTabletsOfStone myMessage = new MsgTabletsOfStone(0, "ThisIsMe");
        System.out.println(myMessage);
        objOutStream.writeObject(myMessage);
        
        InputStream inStream = socket.getInputStream();
        ObjectInputStream objInStream = new ObjectInputStream(inStream);
        MsgTabletsOfStone inMessage = (MsgTabletsOfStone)objInStream.readObject();
        System.out.println(inMessage);
        
        socket.close();
    }
}
