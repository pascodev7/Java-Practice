import java.util.ArrayList;
import java.util.List;

class Producer extends Thread{
    List<Integer> list;

    public Producer(List<Integer> list){
        this.list = list;
    }

    public void run(){

        try{
            synchronized (list){
                while(true){
                    if(list.size()>0)
                        list.wait();
                    else
                        producerItem();
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void produceItem() throws InterruptedException{

        for(int i = 1; i<=5; i++) {
            Thread.sleep(1000);
            list.add(i);
            System.out.println("Added element in the list by producer" + i);
        }
        list.notifyAll();
    }
}
cxzsa