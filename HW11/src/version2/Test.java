package version2;

public class Test {
    public static void main(String[] args) {
        // two method
        Print printPingPong = new Print();

        Ping ping = new Ping(printPingPong);
        Pong pong = new Pong(printPingPong);

        Thread threadPing = new Thread(ping);
        Thread threadPong = new Thread(pong);

        threadPing.start();
        threadPong.start();

    }
}
