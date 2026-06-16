
import java.io.*;
import java.net.*;

public class UdpClient {

    public static void main(String[] args) throws IOException {

        // 1. Create Datagram socket object...
        DatagramSocket socket = new DatagramSocket();

        // 2. Create bytes...
        byte[] bytes = new byte[256];

        // 3. IP address nikalnu paro...
        InetAddress address = InetAddress.getByName("localhost");

        // 4. Send request to server...
        // 4.1 first create a datapacket...
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, 6969);

        // 4.2 then send packet to the server..
        socket.send(packet);

        // 5. Receive response from server...
        socket.receive(packet);

        // 6. Display the response in client...
        String response = new String(packet.getData());
        System.out.println("Server says: " + response);

        // 7. close the socket...
        socket.close();
    }
}
