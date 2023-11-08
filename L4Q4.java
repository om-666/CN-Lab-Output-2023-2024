package LAB4;
 import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.*;
public class L4Q4 {
    public static void main(String[] args) {
        Enumeration<NetworkInterface> interface1;
        try {
            interface1 = NetworkInterface.getNetworkInterfaces();
             while(interface1.hasMoreElements())
        {
            NetworkInterface ni=interface1.nextElement();
            System.out.println("\t \t"+ni);
        }
        } catch (SocketException e) {
             
            e.printStackTrace();
        }
       
    }
    
}
