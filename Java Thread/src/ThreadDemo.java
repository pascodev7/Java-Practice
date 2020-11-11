import java.util.Scanner;

public class ThreadDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("x = " );
        int x = in.nextInt();

        System.out.println("y = " );
        int y = in.nextInt();

        Thread t1 = new Thread(new HelloTask());
        Thread t2 = new Thread(new AdditionThread());

        t1.start();
        t2.start();
    }
}
