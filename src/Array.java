import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int [] nums = new int[5];
        nums [0] = 9;
        nums [3] = 10;
        System.out.println(nums[0]);
        System.out.println(nums[1]);


        int [] numbers = {2,6,3,2,15,4,9} ;
        System.out.println(numbers[6]);
        System.out.println(numbers.length);

        int sum = 0;
        for (int i = 0; i<numbers.length; i++) {
            //System.out.println( numbers[i]);

            sum = sum + numbers[i];
            System.out.println(sum);
        }

        // find highest value inside the array
        int max=0;

        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i]> max) {
                max = numbers[i]; {
                    System.out.println(max);
                }
            }
        }

        // i want to print only the odd numbers

        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
            System.out.println(numbers[i]);
        }
        }

        // get the sum of the values of the array and stop the when sum>50
        //print the value/index when it is stopping
        int [] nums5 = {2,9,8,6,25,7,5,3,9};

        sum = 0;

        for (int i=0; i<nums5.length; i++) {
            sum = sum + nums5[i];
            if (sum>50) {
                System.out.println(sum);
                System.out.println(nums5[i]);
                break;
            }
        }

    }
}
