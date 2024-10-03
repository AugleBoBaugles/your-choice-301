

/* Author: Augy Markham
 * Creation Date: 10-02-24
 * 
 * This class represents a Televion Show.
 */
import java.util.List;

public class TelevisionShow {
    private String title;
    private int season;
    private List<String> cast;

    public TelevisionShow(String title, int season, List<String> cast){
        this.title = title;
        this.season = season;
        this.cast = cast;
    }

    public String getTitle(){
        return title;
    }

    public List<String> getCast(){
        return cast;
    }

    public String toString(){
        return "Title: " + title + "\nTotal Seasons: " + season + "\nCast: " + cast;
    }
}
