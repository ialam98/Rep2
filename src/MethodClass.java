public class MethodClass {
    public static void main(String[] args) {


        int num1 = 5;
        int num2 = 6;
        int sum = num1 + num2;
        System.out.println(sum);

        addSum();
        addSum();
        addSum2(6, 7);
        addSum2(10, 33);
        printSquare(16);
        largeNum(77, 6);
        int lnum = returnLarger(90,91);
        System.out.println(lnum+ " main method");


    }

    public static void addSum() {

        int num1 = 9;
        int num2 = 7;
        int sum = num1 + num2;
        System.out.println(sum);

    }

    public static void addSum2(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("sum is " + sum);
    }

    //write a method which takes 1 parameter and print the square of the value;

    public static void printSquare(int num1) {
        int square = num1 * num1;
        System.out.println(square);
    }
    // write a method which has params and print the larger one

    public static void largeNum(int num1, int num2) {

        if (num1 > num2) {
            System.out.println(num1);
        } else System.out.println(num2);

    }

    public static int returnLarger(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;

    }
    }

}
