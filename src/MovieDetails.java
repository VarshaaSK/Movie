import java.util.*;
public class MovieDetails {
    private String title;
    private String studio;
    private String rating;

    private String movieTitle;
    private String movieStudio;
    private String movieRating;


    MovieDetails(String title, String studio, String rating){
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    MovieDetails(String movieTitle, String movieStudio){
        this.title = movieTitle;
        this.studio = movieStudio;
        this.rating = "PG";
    }

    public void showMoviedetails(){
        System.out.println("Movie Name : " + title);
        System.out.println("Studio : " + studio);
        System.out.println("Rating for the Movie : " + rating);
    }


    public static List<String> getPg(List<MovieDetails> movieDetails){
        List<String> movieWithPgRating = new ArrayList<>();

        for(MovieDetails movieName : movieDetails){
            if(movieName.rating == "PG"){
                movieWithPgRating.add(movieName.title);
            }
        }
        return movieWithPgRating;
    }
    public static void main(String[] args) {

        List<MovieDetails> movieResult = new ArrayList<>();

        MovieDetails details = new MovieDetails("Casino Royale","Eon Productions" , "PG-13");
        details.showMoviedetails();
        

        MovieDetails detailsWithDefaultRating = new MovieDetails("BAHUBALI","LYCA Productions");
        movieResult.add(detailsWithDefaultRating);

        MovieDetails moviePg = new MovieDetails("MEGALODON","STAR Productions" , "R");
        movieResult.add(moviePg);

        MovieDetails moviePg2 = new MovieDetails("PRINCE","SK Productions" , "PG");
        movieResult.add(moviePg2);

        System.out.println("");

        System.out.println("List of Movies : ");
        for(MovieDetails movieList : movieResult){
            System.out.println(movieList.title);
        }

        System.out.println("\n");
        System.out.println("Movies with PG Rating : ");
        List<String> detailsFromGetPg = getPg(movieResult);
        for(String movieTitle : detailsFromGetPg){
            System.out.println(movieTitle);
        }
//        System.out.println(detailsFromGetPg);

    }
}