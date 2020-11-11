package arrays.com.pascodev.repeated;


/**
 *                 FINDING DUPLICATES IN AN ARRAY
 *        The problem is that we want to find duplicates in a one-dimensional array of integers in O(N) running time
 *        where the integer values are smaller than the length of the array.
 *
 *        ---> 1.) of course we can use the BRUTE-FORCE APPROACH (comparing items with all the rest) but it has O(N^2)
 *                 running time
 *
 *        ---> 2.) we can use HASHMAPS
 *                 Traverse the given array and try to insert each item in a hastable with the value as the the key.
 *                 If you cannot insert the item it means it is a duplicate
 *
 *                        PROBLEM: not an in-place algorithm, we can do better than this
 *
 *        ---> 3.) using ABSOLUTE VALUES: with this approach we can achieve O(N) running time algorithm that is in place
 *                 as well
 **/


public class RepeatedIntegerProblem {

    public void solve(int[] array){

        // this is why it is an O(N) running time algorithm
        for (int i = 0; i < array.length; ++i){

            // if this value is positive we have to flip
            if (array[Math.abs(array[i])] > 0){
                array[Math.abs(array[i])] = -array[Math.abs(array[i])];
                // Otherwise it is negative: it means repetition
            } else {
                System.out.println(Math.abs(array[i]) + " is a repetition!");
            }
        }
    }
}
