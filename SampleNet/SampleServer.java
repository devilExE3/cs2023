package SampleNet;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SampleServer {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello to SampleServer");
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);

        ServerSocket srvSocket = new ServerSocket(5025);
        System.out.println("Accepting message");
        System.out.println(srvSocket.getSoTimeout());
        srvSocket.setSoTimeout(5000);
        System.out.println(srvSocket.getSoTimeout());
        Socket socket = srvSocket.accept();
        System.out.println("Got a connection");

        socket.close();
        srvSocket.close();
    } 
}
