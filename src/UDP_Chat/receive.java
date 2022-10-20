package UDP_Chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class receive implements Runnable{
    DatagramSocket socket = null;
    private int port;
    private String s;

    public receive(int port, String s) throws SocketException {
        this.port = port;
        this.s = s;
        socket = new DatagramSocket(port);
    }

    @Override
    public void run() {
        while (true){

            try {
                byte[] b = new byte[1024];
                DatagramPacket packet = new DatagramPacket(b,0,b.length);
                socket.receive(packet);
                byte[] d = packet.getData();
                String str = new String(d, 0, d.length);
                System.out.println(this.s + ":" + str);
                if (str.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
        socket.close();
    }
}
