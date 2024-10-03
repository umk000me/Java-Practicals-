import java.net.*;

public class InetExmp {
    public static void main(String[] args) {
        try {
            String hostname = "www.google.com";
            InetAddress[] addresses = InetAddress.getAllByName(hostname);
            System.out.println("IP address for " + hostname + ":");

            for (InetAddress address : addresses) {
                System.out.println(address.getHostAddress());
            }
        } catch (UnknownHostException e) {
            System.out.println("Host not Found: " + e.getMessage());
        }
    }
}
