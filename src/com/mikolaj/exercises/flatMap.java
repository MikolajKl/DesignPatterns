package com.mikolaj.exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class flatMap {

    public static void main(String[] args) {

        List<List<String>> nameList = Arrays.asList(
                Arrays.asList("Szymon", "Wojciech", "Adam"),
                Arrays.asList("Anna", "Janina", "Malgorzata"));

        nameList.stream()
                .flatMap(e -> e.stream())
                .filter(e -> e.startsWith("A"))
                .forEach(e -> System.out.println(e));

        Map<String, List<String>> map = new HashMap<>();
        map.put("men", Arrays.asList("Szymon", "Wojciech", "Adam"));
        map.put("woman", Arrays.asList("Anna", "Janina", "Malgorzata"));

        map.entrySet()
                .stream()
                .flatMap(e -> e.getValue().stream())
                .filter(UserPredicateFactory.nameStartsWith("A"))
                .sorted()
                .forEach(e -> System.out.println(e));


    }
}
