package aula12;
import java.io.*;
import java.util.*;

public class ex2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("aula12/A_cidade_e_as_serras.txt"));
        TreeMap<Character, HashMap<String,Integer>> palavras = new TreeMap<>();

        while(scanner.hasNext()){
            String[] words = scanner.nextLine().split(" ");
            for(String word : words){
                if (word.length() >= 3) {
                    Character character = word.charAt(0);
                    palavras.putIfAbsent(character, new HashMap<>());

                    HashMap<String, Integer> map = palavras.get(character);

                    palavras.get(character).put(word, map.getOrDefault(word, 0) + 1);
                }
            }
        }

        for (Character character : palavras.keySet()) {
            System.out.println(character + ": " + palavras.get(character));        }

    }
}
