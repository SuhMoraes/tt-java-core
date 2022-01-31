package aula05;

import java.util.*;

public class ExemploAula05
{
    public static void main(String[] args) {
        list();
        set();
        map();
    }

    private static void list() {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.set(0,4); // Vai substituir o indice 0.
        list.contains(2);
        list.remove(1);
        System.out.println(list);

        List<String> stringList = new ArrayList<>();
        stringList.add(" Item 1 ");
        stringList.add(" Item 2 ");
        stringList.add(" Item 3 ");

        String st = stringList.get(1);

        System.out.println(st);

//        stringList.remove(" Item 3 ");
//        stringList.remove(0);

        stringList.sort(Comparator.reverseOrder()); // Ordena de forma reversa.

        System.out.println(stringList);
    }

    private static void set(){
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        System.out.println(set);
    }

    private static void map(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Mariano", 40);
        System.out.println(map);

    }
}
