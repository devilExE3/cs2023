package SampleNet;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SampleClient {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello to SampleClient");
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
        System.out.println("Connecting");
        Socket socket = new Socket(inetAddress, 5025);
        System.out.println("Connected");
        
        socket.close();
    } 
}
