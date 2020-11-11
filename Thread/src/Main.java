public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ServerThread thread1 = new ServerThread("Server1");
        //ServerThread thread2 = new ServerThread("Server2");
        //thread2.setPriority(Thread.MAX_PRIORITY);
        //System.out.println(thread2.getName() + " priority: " + thread2.getPriority());
        System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
        thread1.start();
        //thread2.start();

    }

}
