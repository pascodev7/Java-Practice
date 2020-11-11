public class Q2Thread implements Runnable {

    String name;
    Thread t;
    private int average;
    int sum = 0;

    public Q2Thread(String name) {
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i=0; i<Q7Main.arr.length; i++)
                sum+= Q7Main.arr[i];

            average = sum/Q7Main.arr.length;
        }finally{
            System.out.println("Calculated average.");
        }

        System.out.println("Average Thread exiting");
    }

    public int getAverage(){
        return average;
    }
}
