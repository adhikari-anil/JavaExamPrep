
import java.io.*;
import java.net.*;

public class UdpServer {

    public static void main(String[] args) throws IOException {
        // 1. create socket using DatagramSocket...
        DatagramSocket socket = new DatagramSocket(6969);

        // create one byte array for holding data...
        byte[] bytes = new byte[256];

        // receive from client....
        DatagramPacket receivedpacket = new DatagramPacket(bytes, bytes.length);
        socket.receive(receivedpacket);

        // response to client...
        InetAddress address = receivedpacket.getAddress();
        int port = receivedpacket.getPort();

        String message = "K xah khabara...";
        bytes = message.getBytes();

        // naya packet banaune send garna ko lagi...
        DatagramPacket sendingpacket = new DatagramPacket(bytes, bytes.length, address, port);
        socket.send(sendingpacket);

        // close connection
        socket.close();
    }
}
