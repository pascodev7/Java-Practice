public class HelloTask implements Runnable{

    public HelloTask() {

    }

    @Override
    public void run() {
        System.out.println("Hello! I am the first thread");
    }
}
