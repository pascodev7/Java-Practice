package arrays.com.pascodev.reversearray;

public class ReverseArrayDemo {

    public static void main(String[] args) {

        int[] nums = {1,2,3, 25, 46, 33, 7, 10, 17 };

        ReverseArray reverseArray = new ReverseArray();

        int[] reversedArray = reverseArray.reverseArray(nums);

        for (int i = 0; i < reversedArray.length; i ++){
            System.out.print(reversedArray[i] + "     ");
        }
    }


}
