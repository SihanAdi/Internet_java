package UDP_Chat;

import java.net.SocketException;

public class teacher {
    public static void main(String[] args) throws SocketException {
        new Thread(new send(9010,"localhost",9090)).start();
        new Thread(new receive(8888,"teacher")).start();
    }
}
