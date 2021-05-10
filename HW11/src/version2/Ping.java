package version2;

public class Ping implements Runnable {
    Print obj;

    public Ping(Print obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            obj.printPing();
        }
    }
}
