public class variables {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print("How is it going?"); //println gives you a line break, if only print is written no line break is there//
        System.out.println("good?");
        int num1 = 8;
        System.out.println(num1);

        num1 = 19;
        System.out.println(num1);

        int num2 = (num1 - 9);
        System.out.println(num2 + num1);

        double d1 = 12;
        System.out.println(d1);

        d1 = (double) 11 / 3;
        System.out.println(d1); /*instead of 3.666 it will show only 3 because 11 and 3 are both int(whole) number */

        boolean yes = true;
        boolean no = false;

        String YES = "True";
        String NO = "False";

        System.out.println("Are you okay?" + NO);

        if (6 > 7) {
            System.out.println("I am not feeling good"); /*IF the condition inside the braket is not true then nothing will show*/
        }

        if (9 > 7) {
            System.out.println("I will watch a movie");
        }

        num2 = 2 + 6 * 5 / 2;
        System.out.println(num2);

        num1 = 8;
        num2 = 8;
        if (num1 == num2) {
            System.out.println("This is may" + num2);
        }

        num1 = 8;
        num2 = 8;

        if (num1 > num2) {
            System.out.println("This is may" + num2);
        } else {
            System.out.println("You are a may");
        }

        int a = 9;
        int b = 10;

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
        if (a < b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

        a = 30;
        b = 20;
        int c = 32;

        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

//        // if the value is within 90-100 it will print  grade a
//        80-89 print B
//        70-79 print c
//        60-69 print D
//                else print F

        int Grade = -75;

        if (Grade >= 90 && Grade <= 100) {
            System.out.println("A");
        } else if (Grade >= 80 && Grade <= 89) {
            System.out.println("B");
        } else if (Grade >= 70 && Grade <= 79) {
            System.out.println("C");
        } else if (Grade >= 80 && Grade <= 89) {
            System.out.println("B");
        } else if (Grade >= 60 && Grade <= 69) {
            System.out.println("B");
        } else if (Grade > 0 && Grade <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Grade cannot be shown");
        }

        int num5 = 30;
        int num6 = 40;

        if (num5 >= 0 && num6 <= 30) {
            System.out.println("got it");
        } else if (num5 >= 30 || num6 <= 40) {
            System.out.println("Fuck it");
        }


        int sal = 5000;
        //if the salary is more than 10000 print "higher salary" else print "lower salary"
        // salary can not be more than 50000 and less than 3000

        if (sal < 50000 && sal > 3000) {
            if (sal > 10000) {
                System.out.println("Higher Salary");
            } else {
                System.out.println("Lower Salary");
            }
        } else {
            System.out.println("invalid");
        }

        boolean greenlight = true;
        boolean redlight = false;

        if (greenlight){
            System.out.println("go");
            if (redlight) {
                System.out.println("stop");
            }
        }


    }

}




