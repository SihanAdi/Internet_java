import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPtest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address1 = InetAddress.getByName("127.0.0.1");
        System.out.println(address1);
        InetAddress address2 = InetAddress.getByName("localhost");
        System.out.println(address2);
        InetAddress address3 = InetAddress.getByName("Localhost");
        System.out.println(address3);
        InetAddress address4 = InetAddress.getLocalHost();
        System.out.println(address4);
        InetAddress address5 = InetAddress.getByName("www.google.com");
        System.out.println(address5);
        System.out.println(address5.getAddress());
        System.out.println(address5.getCanonicalHostName());
        System.out.println(address5.getHostName());
        System.out.println(address5.getHostAddress());


    }
}
