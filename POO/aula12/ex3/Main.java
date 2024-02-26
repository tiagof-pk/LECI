package aula12.ex3;
import aula12.Movie;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("aula12/ex3/movies.txt"))) {
            String[] headers = scanner.nextLine().split("\t");

            while (scanner.hasNextLine()) {
                String[] values = scanner.nextLine().split("\t");

                String name = "";
                double score = 0.0;
                String rating = "";
                String genre = "";
                int runningTime = 0;

                for (int i = 0; i < headers.length; i++) {
                    switch (headers[i]) {
                        case "name" -> name = values[i];
                        case "score" -> score = Double.parseDouble(values[i]);
                        case "rating" -> rating = values[i];
                        case "genre" -> genre = values[i];
                        case "running time" -> runningTime = Integer.parseInt(values[i]);
                    }
                }

                Movie movie = new Movie(name, rating, genre,score, runningTime);
                movies.add(movie);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Ordem Alfabetica
        //movies.sort(Movie::compareTo);

        //Ordem crescente do run Time
        //movies.sort((m1, m2) -> {if (m1.getRunTime() > m2.getRunTime()) return 1;if (m1.getRunTime() < m2.getRunTime()) return -1;return 0;});

        //Ordem decrescente do score
        //movies.sort((m1, m2) -> {if (m1.getScore() < m2.getScore()) return 1;if (m1.getScore() > m2.getScore()) return -1;return 0;});

        TreeMap<String,Integer> genres = new TreeMap<>();
        for(Movie movie : movies){
            if (genres.containsKey(movie.getGenre())) {
                genres.put(movie.getGenre(), genres.get(movie.getGenre()) + 1);
            } else{
                genres.putIfAbsent(movie.getGenre(),1);
            }

        }
        System.out.println(genres);


        //Criar ficheiro com filmes com score > 60
        mySelection("action", movies);

        for (Movie movie : movies) {
            System.out.println(movie);
        }


    }

    public static void mySelection(String genre, List<Movie> movies) {
        try (FileWriter writer = new FileWriter("aula12/ex3/mySelection.txt")) {
            for (Movie movie : movies) {
                if (movie.getGenre().equals(genre) && movie.getScore() > 60.0) {
                    writer.write(movie.toString() + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
