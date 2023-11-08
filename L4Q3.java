package LAB4;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.net.spi.InetAddressResolver;
import java.util.*;
public class L4Q3{
    public static void main(String[] args) throws UnknownHostException {
        
        InetAddress  address = InetAddress.getByName("github.com");
        InetAddress address2=InetAddress.getLocalHost();

    
    if (address2 instanceof Inet4Address || address instanceof Inet4Address ) {
      System.out.println("\t The IP address is IPv4.");
    }  if (address2 instanceof Inet6Address || address instanceof Inet6Address ) {
      System.out.println("The IP address is IPv6.");
    } 
    
        
    }
}