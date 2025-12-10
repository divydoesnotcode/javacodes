import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {
    static void main() {
        // ArrayList = A resizeable array that stores objects (autoboxing).
        //              Arrays are fixed in size, but ArrayLists can change.

        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(1);
        list.add(2);
        System.out.println(list);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Coconut");
        fruits.add("DragonFruit");

        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits);
        fruits.add(0,"Pineapple");
        System.out.println(fruits);
        fruits.set(0,"Apple");
        System.out.println(fruits);
        System.out.println();
        Collections.sort(fruits);

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
