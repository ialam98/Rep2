import java.util.Scanner;

public class class_practice2 {
    public static void main(String[] args) {
// Find the n number of odd number.


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many odd number u want to see?");
//
//        int n = scanner.nextInt();
////        int i = 0;
//
//        do {
//            if (i%2==1) {
//                System.out.println(i);
//            } i++;
//        } while (i<=n);


//        // find how many 2 are there in the array
//        int [] nums = {2,6,9,8,2,3,6,2};
//        int count = 0;
//
//        for (int j=1; j< nums.length; j++) {
//            if (nums[j] == 2) {
//                count++;
//            }
//
//            }
//        System.out.println(count);

// Find if there any 2 together in anarray.


        int [] num = {2,6,9,8,2,3,6,2,2};
        int count = 0;

        for (int k=1; k< num.length-1; k++)
            if (num[k] == 2 && num[k + 1]==2) {
                count++;
            }
        System.out.println("count is " + count);



        }
    }






