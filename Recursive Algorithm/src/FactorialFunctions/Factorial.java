package FactorialFunctions;

import java.util.Scanner;

public class Factorial {
        public static void main(String[] args) {
            Scanner nValue = new Scanner(System.in);
            int N = nValue.nextInt();
            System.out.println(factorial(N));
        }

        public static int factorial(int n){
            if(n == 0)
                return 1;
            else if(n == 1)
                return 1;
            else
                return n*factorial(n-1);
        }
    }


