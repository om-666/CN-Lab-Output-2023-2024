package LAB4;
import java.util.*;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class L4Q1 {
    public static void main(String[] args) throws UnknownHostException {
        // Get the IP address of the local host.
        InetAddress  byaAddress = InetAddress.getByName("soa.ac.in");

        // Print the IP address to the console.
        System.out.println("\t \t Google Adress : " +
        (byaAddress.getHostAddress()).trim());
    }
}