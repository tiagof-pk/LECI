package aula11.ex1;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ex1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("aula11/ex1/major.txt"));
        TreeMap<String, HashMap<String, Integer>> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();



        while (sc.hasNext()) {
            sb.append(sc.next()).append(" ");
        }

        String[] line = Arrays.stream(sb.toString().split("[\\s.,:'‘’;?!\\-*{}=+&/()\\[\\]”“\"]+")).filter(word -> word.length() > 2).map(String::toLowerCase).toArray(String[]::new);

        for (int i = 1; i < line.length; i++) {
            if (line[i].length() < 3) {
                continue;
            }
            String word1 = line[i - 1];
            String word2 = line[i];

            map.putIfAbsent(word1, new HashMap<>());

            HashMap<String, Integer> word1Map = map.get(word1);

            map.get(word1).put(word2, word1Map.getOrDefault(word2, 0) + 1);
        }

        System.out.println(map);
    }
}