//6-C
package exe;


public class CountAZTenRunnable implements Runnable {
    String myAlfabetStr = "noalfabet";

    // main メソッドはプログラムのエントリーポイントです。
    public static void main(String[] args) {
        // スレッドを格納する配列を作成します。
        Thread[] threads = new Thread[26];

        // 'a' から 'z' までの26個のスレッドを作成し、開始します。
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i); // 'a' から始めて、次のアルファベットに移動します。
            CountTenRunnable ct = new CountTenRunnable();
            ct.setAlfabet(c + "_chan thread");

            threads[i] = new Thread(ct);
            System.out.println("Starting thread for: " + c);
            threads[i].start();
        }

        // この try-catch ブロックは、0 から 9 までの値を 500 ミリ秒間隔で出力するループを実行します。
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main:i=" + i);

                // メインスレッドを 500 ミリ秒間一時停止します。
                Thread.sleep(500); // ミリ秒単位のスリープ時間
            }
        } catch (InterruptedException e) {
            // スレッドが中断された場合は、例外を出力します。
            System.err.println(e);
        }
    }

    public void setAlfabet(String alfabetstr) {
        myAlfabetStr = alfabetstr;
    }

    // run メソッドは、新しいスレッドが実行するコードを含みます。
    public void run() {
        // この try-catch ブロックは、0 から 9 までの値を 1000 ミリ秒間隔で出力するループを実行します。
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(myAlfabetStr + " runnable thread:i=" + i);

                // スレッドを 1000 ミリ秒間一時停止します。
                Thread.sleep(1000); // ミリ秒単位のスリープ時間
            }
        } catch (InterruptedException e) {
            // スレッドが中断された場合は、例外を出力します。
            System.err.println(e);
        }
    }
}

class CountTenRunnable extends CountAZTenRunnable {
    // カウント用のクラスを拡張します。必要に応じてこのクラスを変更できます。
}