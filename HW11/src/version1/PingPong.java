package version1;

public class PingPong extends Thread{
    private static String flag = "ping";
    String value = new String();

    PingPong(String name, String value){
        super(name);
        this.value = value;
    }

    @Override
    public void run() {

        while (true){
            if (!value.equals(flag)) {
                System.out.println(value);
                flag = value;
            }
        }
    }
}
