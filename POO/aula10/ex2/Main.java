package aula10.ex2;

import aula10.ex1.Class.Book;

public class Main {
    public static void main(String[] args) {
        Genre storage = new Genre();

        // Adicionar livros aos géneros
        storage.addBook("Drama", new Book("Book 1", "Author 1", 2020));
        storage.addBook("Romance", new Book("Book 2", "Author 2", 2018));
        storage.addBook("Sci-Fi", new Book("Book 3", "Author 3", 2021));
        storage.addBook("Mystery", new Book("Book 4", "Author 4", 2019));
        storage.addBook("Fantasy", new Book("Book 5", "Author 5", 2017));
        storage.addBook("Drama", new Book("Book 6", "Author 6", 2022));

        System.out.println("--------------------------");
        System.out.println(storage);

        storage.updateBook("Sci-Fi", 0, new Book("New Book 3", "New Author 3", 2022));

        storage.removeBook("Mystery", 0);

        System.out.println("--------------------------");
        System.out.println(storage);

        System.out.println("---------------");
        storage.printGenres();

        System.out.println("---------------");
        storage.printBooks();

        System.out.println("--------------------------");
        Book randomBook = storage.getRandomBook("Drama");
        if (randomBook != null) {
            System.out.println(randomBook);
        } else {
            System.out.println("No books found for Drama genre.");
        }
    }
}
