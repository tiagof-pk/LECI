package aula10.ex4;

import java.io.*;
import java.util.*;

public class ex4 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new FileReader("aula10/ex4/words.txt"));
        List<String> wordsWithMoreThanTwoChars = new ArrayList<>();
        System.out.print("Terminada em 's': ");
        while (input.hasNext()) {
            String word = input.next();

            if (word.length() > 2) {
                wordsWithMoreThanTwoChars.add(word);
            }

            if (word.endsWith("s")) {
                System.out.print(word + " ;");
            }
        }

        wordsWithMoreThanTwoChars.removeIf(word -> !word.matches("[a-zA-Z]+"));

        System.out.println("\nPalavras com mais de 2 caracteres:");
        for (String word : wordsWithMoreThanTwoChars) {
            System.out.println(word);
        }

        input.close();
    }
}
