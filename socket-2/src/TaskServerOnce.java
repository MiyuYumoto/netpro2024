import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TaskServerOnce {

    private static final int PORT = 5000;

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("localhostの" + PORT + "番ポートで待機します");

            while (true) {
                try (Socket socket = server.accept();
                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream())) {

                    System.out.println("クライアント接続を受け付けました。");

                    TaskObject task = (TaskObject) ois.readObject();
                    task.exec();

                    oos.writeObject(task);
                    oos.flush();

                    System.out.println("計算結果をクライアントに送信しました。");
                } catch (Exception e) {
                    System.err.println("クライアントとの通信でエラーが発生しました");
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {
            System.err.println("サーバーでエラーが発生しました");
            e.printStackTrace();
        }
    }
}
