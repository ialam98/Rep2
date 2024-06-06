package exam_prep;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        int [] nums1 = {2,4,3,7,8,4,5};
        int [] nums2 = {5,3,1,6,9,6,4};

        int sum1 =0;

        for (int i = 0; i< nums1.length; i++) {
            sum1= sum1+ nums1[i];
        }


        int sum2 = 0;
        for (int i = 0; i< nums2.length; i++) {
            sum2 = sum2+nums2[i];
        }


        if (sum1 == sum2) {
            System.out.println("Summation of 2 arrays are equal");
        } else {
            System.out.println("Summation of 2 arrays are not equal");
        }


//        Scanner scan2 = new Scanner(System.in);
//
//        System.out.println("Input starting point");
//        int num1 = scan2.nextInt();
//
//        System.out.println("input ending point");
//        int num2 = scan2.nextInt();
//
//        int count = 0;
//        for (int i = num1; i <= num2; i++) {
//            if (i%3 == 0) {
//                System.out.println(i);
//                count++;
//            } if (count == 5)
//                break;
//        }

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Input the first number");
        int num1 = scan1.nextInt();

        System.out.println("Input the Second number");
        int num2 = scan1.nextInt();

        if (num1 >= 50 && num2 <=100){
            if (num1>num2) {
                System.out.println("First number is bigger");
            } else if (num2 > num1) {
                System.out.println("Second number is bigger");
            }
        } else {
            System.out.println("Invalid input");
        }

    }
}
