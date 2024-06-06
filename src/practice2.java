import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {

        //create a calculator, the 2 inputs will be taken from the scanner
        //then it will ask which operation I want to perform (1->+, 2->-
        //3-> *, 4->/ 5-> Exit
        Scanner scan = new Scanner(System.in);

        System.out.println("input 1");
        int input1 = scan.nextInt();

        System.out.println("input 2");
        int input2 = scan.nextInt();

        System.out.println("1->+, 2->-, 3-> *, 4->/ 5-> Exit");
        int operator = scan.nextInt();

        switch (operator) {
            case 1:
            System.out.println("ADD" + (input1+input2));
            break;
            case 2:
                System.out.println("Sub" + (input1-input2) );
                break;
            case 3:
                System.out.println("Multiply" + (input1*input2));
                break;
            case 4:
                System.out.println("Divide" + (input1/input2));

            case 5:
                System.out.println("Good Bye");
                break;
            default:
                System.out.println();
        }
    }
}
