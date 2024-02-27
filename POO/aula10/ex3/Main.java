package aula10.ex3;
import java.util.*;

import static aula10.ex3.CharacterOccurrences.identifyOccurrences;

public class Main {
    public static void main(String[] args) {
        String text = "Hello World";
        Map<Character, List<Integer>> occurrences = identifyOccurrences(text);

        System.out.println("Character Occurrences:");
        for (Map.Entry<Character, List<Integer>> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
