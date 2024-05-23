import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TaskClientOnce {

    private static final int PORT = 5000;
    private static final String HOST = "localhost";

    public static void main(String[] args) {
        try (Socket socket = new Socket(HOST, PORT);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Scanner scanner = new Scanner(System.in)) {

            System.out.print("計算する数値を入力してください: ");
            int execNumber = scanner.nextInt();

            TaskObject task = new TaskObject();
            task.setExecNumber(execNumber);

            oos.writeObject(task);
            oos.flush();

            TaskObject resultTask = (TaskObject) ois.readObject();

            int result = resultTask.getResult();
            System.out.println("サーバからの結果は: " + result);

        } catch (Exception e) {
            System.err.println("エラーが発生しました");
            e.printStackTrace();
        }
    }
}
