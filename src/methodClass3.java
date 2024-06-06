public class methodClass3 {
    public static void main(String[] args) {



        addSumm(14,5.5);
        addSumm(5,5,6);
        addSumm(12,5);
    }
    public static void addSumm(int num1, int num2) {
    System.out.println("Sum is " + (num1 + num2));
    }

    public static void addSumm (int num1, int num2, int num3) {
        addSumm(4,5);
        System.out.println(num1 + num2+ num3);
    }

    public static void addSumm (int num1, double num2) {
        System.out.println(num1 + num2);
    }

}
