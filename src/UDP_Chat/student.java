package UDP_Chat;

import java.net.SocketException;

public class student {
    public static void main(String[] args) throws SocketException {
        new Thread(new send(9000,"localhost",8888)).start();
        new Thread(new receive(9090,"teacher")).start();
    }
}
