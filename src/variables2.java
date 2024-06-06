import java.util.Scanner;

public class variables2 {
    public static void main(String[] args) {
        int i = 10;
        i = i++;
        System.out.println(i++);
        System.out.println(i);



        System.out.println(19%3);  //mod

        if (i%2==1) {    // To find odd or even number or find remainder

            System.out.println(i + "is an odd number");
        } else {
            System.out.println(i + "is an even number");

        }



        i= -50;


        if (i>=0) { // To find out positive or negative number
            System.out.println(i + " is a positive number");
        } else {
            System.out.println(i + " is a negative number");
        }



        int weekday = 5;



        if (weekday == 1){
            System.out.println("Monday");
        } else if (weekday == 2) {
            System.out.println("Tuesday");
        } else if (weekday == 3) {
            System.out.println("Wednesday");
        } else if (weekday == 4) {
            System.out.println("Thursday");
        } else if (weekday == 5) {
            System.out.println("Friday");
        } else if (weekday == 6) {
            System.out.println("Saturday");
        } else if (weekday == 7) {
            System.out.println("Sunday");
        }


         Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int number1 = scanner.nextInt();
        System.out.println("enter another number ");
        int number2 = scanner.nextInt();
        if(number1 > number2) {
            System.out.println("number1 is higher");
        } else {
            System.out.println("number2 is higher");
        }


        int month = 5;
        switch(month) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("Nothing matched");
        }

       // Scanner = new Scanner(System.in);
        System.out.println("Enter Month Number");
        int mnt = scanner.nextInt();

        switch(mnt) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("Nothing matched");
        }


//        for (int i = 0; i<=5; i++) {
//            System.out.println(i);
//
//            if (i==3){
//                continue;
//            }
//            System.out.println("end "+ i);
//            System.out.println("end2 "+ i);
//    }

}
}


