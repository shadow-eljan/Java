package Practise;

public class Cinema {
    String cinemaName;
    int year;

    Movie[] movieList;

    Cinema(String hallName, int year, Movie[] list){
        this.cinemaName = hallName;
        this.year= year;
        this.movieList = list;
    }

    void displayInfo(){
        System.out.println("Cinema Hall Name: " + this.cinemaName);
        System.out.println("Top Cinema Hall of year " + this.year);
        System.out.println("\nBest selling movies: ");
        for (Movie film: movieList){
            film.displayInfo();
        }
    }

}
