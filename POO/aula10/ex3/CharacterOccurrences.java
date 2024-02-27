package aula10.ex3;
import java.util.*;

public class CharacterOccurrences {
    public static Map<Character, List<Integer>> identifyOccurrences(String text) {
        Map<Character, List<Integer>> occurrences = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            List<Integer> positions = occurrences.getOrDefault(ch, new ArrayList<>());
            positions.add(i);
            occurrences.put(ch, positions);
        }

        return occurrences;
    }
}
