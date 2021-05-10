package task2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore table = new Semaphore(2);

        for (int i = 1; i < 6; i++) {
            new Philosopher("philosopher" + i + " ", table).start();
        }
    }
}

class Philosopher extends Thread {
    private Semaphore table;

    public Philosopher(String name, Semaphore table) {
        super(name);
        this.table = table;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "waiting for table");
        try {
            table.acquire();
            System.out.println(this.getName() + "eat at the table");
            this.sleep(500);
            System.out.println(this.getName() + "ate and went out");
            table.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}