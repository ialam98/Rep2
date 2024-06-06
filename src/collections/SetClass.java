package collections;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {

        HashSet <Integer> hashSet = new HashSet<>();

        hashSet.add(9);
        hashSet.add(7);
        hashSet.add(70);
        hashSet.add(77);
        hashSet.add(7);
        hashSet.add(11);

        for (int num : hashSet)  {
            System.out.println(num);
        }

        System.out.println("****************");

        LinkedList <Integer> linkedset = new LinkedList<>();

        linkedset.add(9);
        linkedset.add(7);
        linkedset.add(70);
        linkedset.add(77);
        linkedset.add(7);
        linkedset.add(11);

        for ( int linkNum: linkedset ) {
            System.out.println(linkNum);
        }

        System.out.println("****************");

        Set <Integer> treeSet = new TreeSet<>();

        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(70);
        treeSet.add(77);
        treeSet.add(7);
        treeSet.add(11);

        for ( int treeNum: treeSet ) {
            System.out.println(treeNum);
        }






    }
}
