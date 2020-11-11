import java.util.Scanner;

public class Q7Main {

    public static int[] arr = new int[3];

    static Scanner in = new Scanner(System.in);
    private static int finalAverage;

    public static void main(String[] args) {

        System.out.println("Enter the numbers: ");
        for(int i=0; i<arr.length; i++)
            arr[i] = in.nextInt();
        System.out.println("The numbers are: ");
        for(int x:arr){
            System.out.print(x+ "  ");
        }
        System.out.println("\n\n");

        Q2Thread obj = new Q2Thread("Average");

        try{
            obj.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }

        finalAverage = obj.getAverage();
        System.out.println("The average of the numbers is: " +finalAverage);
    }
}
