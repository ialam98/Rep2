import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.print("Hello");
            System.out.println(" New York ");
            System.out.println("value of i:" + i);
        }

        for (int i = 1; i <= 3; i = i + 1) {
            System.out.print("Hello");
            System.out.println(" New York ");
            System.out.println("value of i:" + i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i = i + 2) {
            if (i % 2 == 0) {
                System.out.println("value of i:" + i);
                sum = sum + i;
                System.out.println(i);
            }
        }

        //write a prog to write the summation of 1-100

        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            if (sum > 3000)
                break;
        }
        {
            System.out.println(sum);
        }

        int p = 1;

        do {
            System.out.println("Hello");
            p++;
        } while (p < 3);


        while (p < 3) ;
        {
            System.out.println("hello bro");
            p++;
        }

        for (p = 0; p < 10; p++) {
            p++;
            System.out.println(p);
            p++;
        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

            if (i == 3) {
                continue;
            }
            System.out.println("end " + i);
            System.out.println("end2 " + i);

        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter loop ending number");
//        int endNumber = scanner.nextInt();
//
//        for (int i=1; i<endNumber; i++) {
//            System.out.println(i);
//        }
//
//        //find all the number divisible by 3
//        // Starting and ending point will be given on the output screen
//        Scanner scan1 = new Scanner(System.in);
//
//        System.out.println("Enter loop starting point");
//        int startpt = scanner.nextInt();
//
//        System.out.println("Enter loop ending point");
//        int endpoint = scanner.nextInt();
//
//        for (int i=startpt; i<=endpoint; i++ ) {
//            if (i%3==0) {
//                System.out.println(i);
//            }
//        }

        //create a calculator, the 2 inputs will be taken from the scanner
        //then it will ask which operation I want to perform (1->+, 2->-
        //3-> *, 4->/ 5-> Exit

//        for (int i= 1; i<=1;) {
//            System.out.println(i);
//        }

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

            if (i == 3) {
                continue;
            }
            System.out.println("end " + i);
            System.out.println("end2 " + i);

        }
    }
}



















