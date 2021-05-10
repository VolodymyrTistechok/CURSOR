package version2;

public class Print {
    private boolean flag;

    public synchronized void printPing() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("ping");
        flag = true;
        notifyAll();
        ;

    }

    public synchronized void printPong() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("pong");
        flag = false;
        notifyAll();
    }
}
