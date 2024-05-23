import java.io.Serializable;

public class TaskObject implements ITask, Serializable {
    private int execNumber;
    private int result;

    @Override
    public void setExecNumber(int x) {
        this.execNumber = x;
    }

    @Override
    public void exec() {
        this.result = findMaxPrime(execNumber);
    }

    @Override
    public int getResult() {
        return this.result;
    }

    private int findMaxPrime(int x) {
        for (int i = x; i > 1; i--) {
            if (isPrime(i)) {
                return i;
            }
        }
        return -1; // 2より小さい値の場合、素数がない
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}
