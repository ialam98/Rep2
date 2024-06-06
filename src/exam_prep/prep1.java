package exam_prep;

import org.w3c.dom.ls.LSOutput;

public class prep1 {
    public static void main(String[] args) {


        int num1 = 999;
        int num2 = 555;
        int num3 = 666;


        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest number");
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is the smallest number");
        } else System.out.println(num3 + " is the smallest number");


        //LOOP

        for (int i = 1; i < 5; i++) {
            System.out.println(i + 2);
            i++;
        }

        // find a prime number. 15


        // find the sum of even number from 1 to 100;

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println(sum);

        //find 1911 to 2024 find leap year

        int count = 0;
        int year = 1;

        for (int i = 1911; i <= 2024; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }

        }



        int i = 15;

        do {
            System.out.println(i);
            i++;
        }while (i<22);

//
        // to stop at 18
        i = 15;
        while (i<22) {
            System.out.println(i);
            if(i==18) {
                break;
            }
            System.out.println("inside the loop "+i);
            i++;
        }

        // to skip 18
        i = 15;
        while (i<22) {
            System.out.println(i);
            if(i==18) {
                continue;
            }
            System.out.println("inside the loop "+i);
            i++;
        }





    }
}



