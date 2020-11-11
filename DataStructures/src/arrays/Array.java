

package arrays;

public class Array {

    public static void main(String [] args){

        int [] nums = new int[5];
        int [] nums2 = new int[10];

                for(int i =1; i < nums.length; ++i)
                    nums[i] = 2*i;

                // O(1) random index
        int num = nums[3];
        System.out.println(num);

        // O(N) "Linear search" --> O(logN) binary trees --> O(1) hashTables
        for(int i =1; i < nums.length; ++i){
            if( nums[i] != 4){
                System.out.println("Index found, " + i);
            }
        }


      //  nums[5] = 10;

    }

}
