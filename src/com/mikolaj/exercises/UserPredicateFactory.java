package com.mikolaj.exercises;

import java.util.function.Predicate;

/**
 * Created by Notek on 2017-06-06.
 */
public class UserPredicateFactory {
//    lambda - anonimowa implementacja interfejsu z jedną metodą
//    predykat - interfejs z jedną metodą

    public static Predicate<String> nameStartsWith(String prefix){
        return s -> s.startsWith(prefix);
//        return (e) -> e.startsWith(prefix); // lambda
    }
}
