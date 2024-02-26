package aula12;

import java.util.Objects;

public class Movie implements Comparable<Movie> {
    String name, rating, genre;
    double score, runTime;

    public Movie(String name, String rating, String genre, double score, double runTime) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.score = score;
        this.runTime = runTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.score, score) == 0 && Double.compare(movie.runTime, runTime) == 0 && Objects.equals(name, movie.name) && Objects.equals(rating, movie.rating) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rating, genre, score, runTime);
    }

    @Override
    public String toString() {
        return "Movie :" +name +
                "\n score :" + score +
                "\n rating :" + rating +
                "\n genre :" + genre +
                "\n runTime :" + runTime;
    }
    @Override
    public int compareTo(Movie other) {
        return name.compareTo(other.getName());
    }
}
