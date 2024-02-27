package aula12;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ex1 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("aula12/A_cidade_e_as_serras.txt"));
        LinkedList<String> palavras = new LinkedList<>();

        while (scanner.hasNext()) {
            String[] words = scanner.nextLine().split(" ");

            Collections.addAll(palavras, words);
        }
        HashSet<String> palavrasDiferentes = new HashSet<>(palavras);

        System.out.println("Número Total de Palavras: " + palavras.size());
        System.out.println("Número de Diferentes Palavras: " + palavrasDiferentes.size());
    }
}