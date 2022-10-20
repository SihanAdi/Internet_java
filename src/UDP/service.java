package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Arrays;

public class service {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] b = new byte[4];
        DatagramPacket packet = new DatagramPacket(b,0,b.length);
        socket.receive(packet);
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData(),0,packet.getData().length));
    }
}
