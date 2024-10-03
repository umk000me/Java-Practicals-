import java.net.*;

public class InetEx {
    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Address: " + localHost.getHostAddress());
            System.out.println("Local Host Name: " + localHost.getHostName());
        } catch (UnknownHostException e) {
            System.out.println("Host not Found: " + e.getMessage());
        }
    }
}
