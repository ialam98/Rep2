package collections;

import java.util.ArrayList;
import java.util.List;

public class ListClass2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Hannan");
        names.add("Iftekhar");
        names.add("Khan");
        names.add("Shuvashish");

        //find out the number of a in the arraylist

        int count = 0;
        for (String name : names) {
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    // write a method which will take 2 list and
    // return a list with the values of the list

    public List<Integer> combineList (List<Integer> nums1, List<Integer>nums2) {
        for (int num : nums2) {
            nums1.add(num);
        }
        return nums1;
    }


}



