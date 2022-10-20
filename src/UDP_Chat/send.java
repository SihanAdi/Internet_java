package UDP_Chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class send implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;
    private int fromPort;
    private String toIP;
    private int toPort;

    public send(int fromPort, String toIP, int toPort) {
        this.fromPort = fromPort;
        this.toIP = toIP;
        this.toPort = toPort;
        try {
            socket = new DatagramSocket(fromPort);
            reader = new BufferedReader(new InputStreamReader(System.in));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true){
            try {
                String s = reader.readLine();
                byte[] b = s.getBytes(StandardCharsets.UTF_8);
                DatagramPacket packet = new DatagramPacket(b,0,b.length,new InetSocketAddress(this.toIP,this.toPort));
                socket.send(packet);
                if (s.equals("bye")){
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
        socket.close();
        try {
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
