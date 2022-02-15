package structure;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    @Test
    public void task1() {
        //    Задано множество фамилий сотрудников. Разработать программу,
        //    которая отображает все фамилии, начинающиеся на букву «J»

        List<String> lastnameList = new ArrayList<>();

        lastnameList.add("Kolmakova");
        lastnameList.add("Goleev");
        lastnameList.add("Jankens");
        lastnameList.add("Marinina");
        lastnameList.add("Joly");
        lastnameList.add("Omelov");

        char symbolToFind = 'J';

        List<String> sortedLastnameList = lastnameList.stream()
                .filter(s -> s.charAt(0) == symbolToFind)
                .collect(Collectors.toList());

        sortedLastnameList.forEach(System.out::println);
    }

    @Test
    public void task2() {
//        Найти сумму нечетных чисел в коллекции

        List<Integer> numberList = new ArrayList<>();

        numberList.add(12);
        numberList.add(1);
        numberList.add(45);
        numberList.add(33);
        numberList.add(90);

        Optional<Integer> sum = numberList.stream()
                .filter(i -> i % 2 == 1)
                .reduce((i1, i2) -> i1 + i2);

        sum.ifPresent(System.out::println);
    }
}
