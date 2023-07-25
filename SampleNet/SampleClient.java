package SampleNet;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SampleClient {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello to SampleClient");
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
        System.out.println("Connecting");
        Socket socket = new Socket("192.168.5.157", 5025);
        System.out.println("Connected");

        OutputStream outStr = socket.getOutputStream();
        ObjectOutputStream objOutStream = new ObjectOutputStream(outStr);

        String myMessage = "Hello from Client!";
        System.out.println(myMessage);
        objOutStream.writeObject(myMessage);
        
        
        socket.close();
    } 
}
