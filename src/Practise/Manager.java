package Practise;

public class Manager {

    public static void main(String[] args) {

        Movie m1 = new Movie("Avengers EndGame", 200.00);
        Movie m2 = new Movie("Doctor Strange", 100.00);
        Movie m3 = new Movie("Iron Man", 150.00);

        Movie[] movies = {m1, m2, m3};

        Cinema cinema = new Cinema("Entertainment", 2025, movies);

        cinema.displayInfo();
    }
}
