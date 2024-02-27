package aula10.ex1;


import aula10.ex1.Class.Genre;
import aula10.ex1.Class.Book;


public class Main {

    public static void main(String[] args) {
        Genre storage = new Genre();

        storage.addBook("Drama", new Book("Book 1", "Author 1", 2020));
        storage.addBook("Romance", new Book("Book 2", "Author 2", 2018));
        storage.addBook("Sci-Fi", new Book("Book 3", "Author 3", 2021));
        storage.addBook("Mystery", new Book("Book 4", "Author 4", 2019));
        storage.addBook("Fantasy", new Book("Book 5", "Author 5", 2017));

        System.out.println("---------------------------");
        System.out.println(storage);


        storage.updateBook("Sci-Fi", new Book("New Book 1", "New Author 1", 2022));
        storage.removeBook("Mystery");

        System.out.println("---------------------------");
        System.out.println(storage);

        System.out.println("---- Genres ----");
        storage.printGenres();

        System.out.println("---- Books ----");
        storage.printBooks();
    }
}