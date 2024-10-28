package org.example.Dz3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> list1=new ArrayList<>();
        list1.add(new Employee("Вталий",18,65000.55));
        list1.add(new Employee("Роман",32,25000.25));
        list1.add(new Employee("Олег",40,20000.83));
        list1.add(new Employee("Дмитрий",28,50000.24));
        list1.add(new Employee("Людмила",45,15000.99));
        list1.add(new Employee("Екатерина",20,50000.40));

        List<Employee> list2 = list1.stream()
                .filter(employee -> employee.getSalary() < 40000)
                .collect(Collectors.toList());
        list2.stream().forEach(h-> System.out.println(h));
    }
}
