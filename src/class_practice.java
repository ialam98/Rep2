import java.util.Scanner;

public class class_practice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
