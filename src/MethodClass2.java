public class MethodClass2 {
    public static void main(String[] args) {

        int [] numbers = {4,6,7,5,3,9,12,5,6,3};
        int [] number2 = {2,5,8,9,1,4,7,3,6,5};

        int sum = getSum(numbers);
        System.out.println(sum);

        compareArray(numbers,number2);

    }

    public static int getSum(int [] nums) {
        int sum = 0;
        for (int i =0; i< nums.length; i++) {
            sum = sum + nums[i];
        } return sum;
    }

    //create a method which will take 2 int[] params and print which array contains more number;

    public static void compareArray(int[] num, int[]nun2) {


        if (num.length > nun2.length) {
            System.out.println("First array is bigger");
        } else if (num.length < nun2.length) {
            System.out.println("Second array is bigger");
        } else {
            System.out.println("Equal");
        }
    }


}



