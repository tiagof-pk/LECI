package aula10.ex2;

import aula10.ex1.Class.Book;

import java.util.*;

public class Genre {
    private TreeMap<String, List<Book>> genreBookMap;

    public Genre() {
        genreBookMap = new TreeMap<>();
    }

    public void addBook(String genre, Book book) {
        genreBookMap.putIfAbsent(genre, new ArrayList<>());
        genreBookMap.get(genre).add(book);
    }

    public void updateBook(String genre, int index, Book updatedBook) {
        List<Book> books = genreBookMap.get(genre);
        if (books != null && index >= 0 && index < books.size()) {
            books.set(index, updatedBook);
        } else {
            System.out.println("Invalid genre or book index.");
        }
    }

    public void removeBook(String genre, int index) {
        List<Book> books = genreBookMap.get(genre);
        if (books != null && index >= 0 && index < books.size()) {
            books.remove(index);
            if (books.isEmpty()) {
                genreBookMap.remove(genre);
            }
        } else {
            System.out.println("Invalid genre or book index.");
        }
    }

    public Book getRandomBook(String genre) {
        List<Book> books = genreBookMap.get(genre);
        if (books != null && !books.isEmpty()) {
            Random random = new Random();
            int index = random.nextInt(books.size());
            return books.get(index);
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Book>> entry : genreBookMap.entrySet()) {
            String genre = entry.getKey();
            List<Book> books = entry.getValue();
            sb.append("Genre: ").append(genre).append(", Books: ");
            for (Book book : books) {
                sb.append(book.toString()).append("; ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void printGenres() {
        System.out.println("Genres: " + genreBookMap.keySet());
    }

    public void printBooks() {
        List<Book> allBooks = new ArrayList<>();
        for (List<Book> books : genreBookMap.values()) {
            allBooks.addAll(books);
        }
        System.out.println("Books: " + allBooks);
    }
}
