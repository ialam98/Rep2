package Exception;

public class Exceptionclass {
    public static void main(String[] args) {

        System.out.println("Hello World");

        int [] nums = {2,6,9};

        try {
            System.out.println(nums[3]);
        } catch (Exception e) {
            System.out.println("There is an exception");
        }
        System.out.println("Finished");

    }
}
