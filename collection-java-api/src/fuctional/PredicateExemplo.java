package fuctional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.function.Predicate;

public class PredicateExemplo {
    public static void main(String[] args) {
        List<String> palavras =  Arrays.asList("Java","Kotlin","Python","c++","C","go");

        Predicate<String> maisDeCincoPalavras = palavra -> palavra.length() > 5;

        palavras.stream()
        .filter(p -> p.length() < 5)
        .forEach(System.out::println);

    }
}
