package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Dz2
{
    public static void main( String[] args )
    {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(99);
        list1.add(25);
        list1.add(7);
        list1.add(18);
        list1.add(35);
        list1.add(4);
        list1.add(3);
        list1.add(100);

        System.out.println("Числа больше 20");
        List<Integer> list2 = list1.stream()
                .filter(num -> num > 20)
                .collect(Collectors.toList());
        list2.stream().forEach(num -> System.out.println(num));
        System.out.println("------------------");

        System.out.println("Числа больше 50");
        List<Integer> list3=list1.stream().
                filter(d-> d>50).
                collect(Collectors.toList());
        list3.stream().forEach(d-> System.out.println(d));


    }
}
