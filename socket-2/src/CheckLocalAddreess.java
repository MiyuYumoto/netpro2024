import java.net.InetAddress;
import java.net.UnknownHostException;

public class CheckLocalAddreess {
    public static void main(String[] args) {
        try {
            // ローカルホストのInetAddressオブジェクトを取得
            InetAddress localHost = InetAddress.getLocalHost();
            
            // ホスト名を取得
            String hostName = localHost.getHostName();
            System.out.println("Host name is: " + hostName);
            
            // IPアドレスを取得
            String ipAddress = localHost.getHostAddress();
            System.out.println("IP address is: " + ipAddress);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

}
