package UDP;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String a = "adsh wu di shuai";
        DatagramPacket packet = new DatagramPacket(a.getBytes(StandardCharsets.UTF_8),
                0,a.getBytes(StandardCharsets.UTF_8).length, InetAddress.getLocalHost(),9090);
        socket.send(packet);
        socket.close();
    }
}
