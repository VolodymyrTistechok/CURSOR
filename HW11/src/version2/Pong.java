package version2;

public class Pong implements Runnable {
    Print obj;

    public Pong(Print obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            obj.printPong();
        }
    }
}
