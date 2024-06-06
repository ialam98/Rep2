public class loop_inside_loop {
    public static void main(String[] args) {


        for (int i= 1; i<5; i++){
            System.out.println("value of i " + i);
            for (int j = 1; j<4; j++) {
                System.out.println("value of j "+ j);
            }
            System.out.println(" ");
        }

        for (int i= 1; i<=8; i++){
            for (int j = 1; j<=8; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i= 1; i<=8; i++){
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
