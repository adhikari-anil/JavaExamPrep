
import java.io.*;
import java.net.*;

public class UdpDatagramClient {

    public static void main(String[] args) throws IOException {

        try (DatagramSocket socket = new DatagramSocket()) {

            InetAddress address = InetAddress.getByName("localhost");
            String msg = "Hello Server";

            byte[] buf = msg.getBytes();

            DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4455);

            socket.send(packet);

            byte[] recievebuf = new byte[256];

            DatagramPacket recievePacket = new DatagramPacket(recievebuf, recievebuf.length);

            socket.receive(recievePacket);

            String response = new String(recievePacket.getData(), 0, recievePacket.getLength());

            System.out.println("From Server: " + response);
        }
    }
}
