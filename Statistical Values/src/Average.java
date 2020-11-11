import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int num[] = new int[5];
        int sum = 0;
        int average = 0;

        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the numbers' sequence --> ");
        for(int i=0; i<num.length; i++){
        num[i] = in.nextInt();}

        System.out.println("You entered the numbers: ");
        for(int x: num){
            System.out.print(x+ " - ");
        }
        System.out.println("\n\n");


        //print the average value
        System.out.print("The averageof the sequence is ---> ");
        System.out.println(findAverageVal(num));

        // print the smallest value
        System.out.print("The smallest value is ---> ");
        System.out.println(findMinVal(num));

        // print the greatest value
        System.out.print("The smallest value is ---> ");
        System.out.println(findMaxval(num));
    }

    // The minimum value function
    public static int findMinVal(int tab[]) {
        // By default the smallest value will be the first value
        int min = tab[0];
        for(int i=0; i<tab.length; i++){
            // if we find a smaller value we replace the prior value by it
            if(tab[i]<min)
                min = tab[i];
        }
        return min;
    }

    // The maximum value function
    public static int findMaxval(int tab[]){
        //By default the greatest value is the last value
        int max = tab[tab.length-1];
        for(int i=0; i<tab.length; i++){
            // if we find a greater value we replace the prior value by it
            if(tab[i]>max)
                max = tab[i];
        }

        return max;
    }

    // The average value function
    public static int findAverageVal(int tab[]){
        int sum = 0;
        int average = 0;
        for(int i=0; i<tab.length; i++){
            sum = sum +tab[i];
        }
        average = sum/tab.length;
        return average;
    }
}
