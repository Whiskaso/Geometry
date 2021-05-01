package pl.edu.agh.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        String[] names = new String[]{"Ala", "Ola", "Asia", "Basia", "Asia", "Ola", "Ela", "Ela", "Ewa", "Ala"};

        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList(names));

        System.out.println(namesList);


        HashSet<String> namesSet = new HashSet<>();
        for(String name: names){
            namesSet.add(name);
        }

        System.out.println(namesSet);

        // 1.
        System.out.println(namesList.get(2));
        // Dla HashSet nie można wyciągnać n-tego elementu

        //2.
        System.out.println(namesList.contains("Ola"));

        //3.
        System.out.println(namesSet.contains("Ola"));

        //4.
        System.out.println(namesList);
        namesList.remove(3);
        System.out.println(namesList);

        //5.
        System.out.println(namesSet);
        namesSet.remove("Ola");
        System.out.println(namesSet);
    }
}
