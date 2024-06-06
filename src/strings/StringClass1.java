package strings;

import org.w3c.dom.ls.LSOutput;

public class StringClass1 {
    public static void main(String[] args) {

        String name = "Iftakharul Alam";
        System.out.println(name);

        int num=9;
        char char1 = 'A';

        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("k")); // It will take only the first character.
        System.out.println(name.indexOf("kh")); // It will take only the first character.

        System.out.println(name.replace('a','e'));
        System.out.println(name.replace("ta", "la"));

        String [] countries = {"BD", "USA", "FRN", "BRA", "ARG"};
        String str = "BD, USA, FRN, BRA, ARG";
        String [] countries2 = str.split(",");

//        for (int i = 0; i< countries.length; i++) {
//            System.out.println(countries2[i]);
//        }

        int sum = 0;

        for (int i = 0; i< countries.length; i++) {
            System.out.println(countries[i]);
            sum = sum + countries[i].length();
        }
        System.out.println(sum);

        // how man lower case a in the array

        // find the longest country name

        String [] countries0 = {"Bangladesh", "USA", "France", "Brazil", "Argentina"};

        int max = 0;
        int index = 0;
        for (int i = 0; i< countries0.length; i++) {

                if (countries0[i].length()>max) {
                    max = countries0[i].length();
                    index = i;
                }
            }
        System.out.println(countries0[index]);

        String city1 = "New York";
        String city2 = "New York";

        if(city1.equals(city2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        System.out.println(city1.contains("New "));




    }
}
