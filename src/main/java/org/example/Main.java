package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        FindMinMax.findMinMax(
                () -> IntStream.range(1, 100).boxed(),
                new FindMinMax.NumberComparator(),
                (min, max) -> System.out.println("Min : " + min + " Max " + max)
        );

        System.out.println("-----------------------------------------------------");

        List<Integer> list = new ArrayList<>();
        list.add(587);
        list.add(56);
        list.add(57845);
        list.add(1000);

        System.out.println("Перед сортировкой");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("После сортировки");
        System.out.println(list);

        Stream<Integer> numbers = list.stream();

        Map<Boolean, List<Integer>> listMap= numbers.sorted().collect(Collectors.partitioningBy((p) -> p % 2 == 0));

        System.out.println("нечентые числа - false, четные числа - true" + listMap);

    }
}