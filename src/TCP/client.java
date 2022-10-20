package TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class client {
    public static void main(String[] args) throws IOException {
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        int port = 9999;
        Socket socket = new Socket(serverIP, port);
        OutputStream os = socket.getOutputStream();
        os.write("adsh zui nb".getBytes(StandardCharsets.UTF_8));
        if (os != null){
            os.close();
        }
        if (socket != null){
            socket.close();
        }

    }
}
