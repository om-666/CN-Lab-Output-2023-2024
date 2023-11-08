package LAB4;
import java.util.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class L4Q2 {
    public static void main(String[] args) throws UnknownHostException {
        // Get the IP address of the local host.
        InetAddress localhost = InetAddress.getLocalHost();

        // Print the IP address to the console.
        System.out.println("\t \t System IP Address : " +
        (localhost.getHostAddress()).trim());
    }
}