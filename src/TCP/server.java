package TCP;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws Exception {
        ServerSocket server = null;
        Socket socket =null;
        InputStream is =null;
        ByteArrayOutputStream bai =null;
                //create an address
        server = new ServerSocket(9999);
        while (true){
            socket = server.accept();
            is = socket.getInputStream();
            bai = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                bai.write(buffer, 0, len);
            }
            System.out.println(bai.toString());

        }



    }

}
