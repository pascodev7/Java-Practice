


class Consumer extends Thread{
    List<Integer> list;

    public Consumer(List<Integer> list) {
        this.list = list;
    }

    public void run(){

        try{
            while(true){
                synchronized(list){
                    if(list.size() == 0)
                        list.wait();
                    else
                        consume();
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void consume() throws InterruptedException{

        while(!list.isEmpty()) {
            Thread.sleep(1000);
            System.out.println("Removed element from the list by consumer = " + list.remove(0));
        }
        list.notifyAll();
    }
}

public class ThreadTest{
    public static void main(String[] args) throws Exception{
        List<Integer> list = new ArrayList<Integer>();
        Producer producer = new Producer(list);
        Consumer consumer = new Consumer(list);

    }
}