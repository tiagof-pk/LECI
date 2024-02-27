package aula10.ex1.Class;

import java.util.*;

public class Genre {
    private Map<String, Book> genreBookMap;

    public Genre() {
        genreBookMap = new HashMap<>();
    }

    public void addBook(String genre, Book book) {
        genreBookMap.put(genre, book);
    }

    public void updateBook(String genre, Book updatedBook) {
        if (genreBookMap.containsKey(genre)) {
            genreBookMap.put(genre, updatedBook);
        } else {
            System.out.println("Genre not found.");
        }
    }

    public void removeBook(String genre) {
        if (genreBookMap.containsKey(genre)) {
            genreBookMap.remove(genre);
        } else {
            System.out.println("Genre not found.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Book> entry : genreBookMap.entrySet()) {
            sb.append("Genre: ").append(entry.getKey()).append(", Book: ").append(entry.getValue().toString()).append("\n");
        }
        return sb.toString();
    }

    public void printGenres() {
        System.out.println("Genres: " + genreBookMap.keySet());
    }

    public void printBooks() {
        System.out.println("Books: " + genreBookMap.values());
    }
}
