public class Movies {
    public static void main(String[] args) {
        movie[] movies = new movie[3];

        movies[0] = new movie("aaa","a","5 Star");
        movies[1] = new movie("bbb","b","4 Star");
        movies[2] = new movie("ccc","c","5 Star");

        movie[] fiveStar = movies[0].get5StarMovies(movies);

        for(movie m :fiveStar){
            if(m==null){
                return;
            }
            System.out.println(m.getTitle()+" "+m.getRating());
        }

    }
}

class movie{
    private String title,studio,rating;

    public movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    public movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        rating = "5 Star";
    }

    public String getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public movie[] get5StarMovies(movie[] movies){
        movie[] fiveStar = new movie[movies.length];
        int i=0;
        for(movie m : movies){
            if(m.rating == "5 Star"){
                fiveStar[i]=m;
                i++;
            }
        }
        return fiveStar;
    }
}