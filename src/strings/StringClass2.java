package strings;

public class StringClass2 {
    public static void main(String[] args) {


        int num1 = 9;

        String color1 = "White";
        System.out.println(("Number is "+num1));

        String num3 = "1133";
        System.out.println(num3+num1);

        String [] colors = {"White", "Blue", "Black", "Red", "Orange"};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i].toUpperCase());
//            System.out.println(i);
        }


        String country = "Americaa";
        char ch = 'a';


        totalNum(country, ch);

        printStringlenght("jefguertjgjetihglewgreitgi");

        String name = "Iftekhar";
        System.out.println(name.substring(3,5));
        System.out.println(name.substring(name.length()-2));

    }

    public static void printStringlenght(String str) {
        System.out.println("legth is " + str.length());




    }

    // create a method which takes 2 params (String and char)
    // print total number of char present in the String

    String countryName = "Bangladesh";
    char char1 = 'a';




    public static void totalNum (String str1, char char1) {

        int totalCharPresent = 0;
        for (int i = 0; i< str1.length(); i++) {
            if(str1.charAt(i) == char1) {
                totalCharPresent++;

            }
        }
        System.out.println(totalCharPresent);

    }



}
