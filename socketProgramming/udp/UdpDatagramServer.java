
import java.io.*;
import java.net.*;

public class UdpDatagramServer {

    public static void main(String[] args) throws IOException {
        try (DatagramSocket socket = new DatagramSocket(4455)) {

            // Receive garne kaam garxah...
            byte[] buf = new byte[256];

            DatagramPacket packet = new DatagramPacket(buf, buf.length);

            System.out.println("UDP server is running.....");

            socket.receive(packet);

            String message = new String(packet.getData(), 0, packet.getLength());

            System.out.println("Client Says: " + message);

            // Response garxah...
            String response = "Hello Client!";
            byte[] sendToClient = response.getBytes();

            DatagramPacket packetToSend = new DatagramPacket(sendToClient, sendToClient.length, packet.getAddress(), packet.getPort());
            socket.send(packetToSend);
        }
    }
}
