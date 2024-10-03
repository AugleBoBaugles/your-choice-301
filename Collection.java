

/* Author: Augy Markham
 * Creation Date: 10-02-24
 * 
 * This programs creates a collection of Television Shows.
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collection {
    public static void main(String[] args) {

        // Building castlist for Doctor Who
        List<String> docWhoCastList = new ArrayList<>();
        docWhoCastList.add("Jodie Whittaker");
        docWhoCastList.add("David Tennant");
        docWhoCastList.add("Matt Smith");
        docWhoCastList.add("Ncuti Gatwa");
        docWhoCastList.add("Peter Capaldi");

        // Building castlist for Anne With An E
        List<String> anneCastList = new ArrayList<>();
        anneCastList.add("Amybeth McNulty");
        anneCastList.add("Geraldine James");
        anneCastList.add("R.H. Thomson");
        anneCastList.add("Andrea Arruti");

        // Creating Instances of Television Show (Doctor Who and Anne With An E)
        TelevisionShow doctorWhoShow = new TelevisionShow("Doctor Who", 26, docWhoCastList);
        
        TelevisionShow anneWithAnEShow = new TelevisionShow("Anne With An E", 3, anneCastList);

        // Printing Television Shows
        System.out.println("------");
        System.out.println("TV Show Details");
        System.out.println("---");

        System.out.println(doctorWhoShow);
        System.out.println();
        System.out.println(anneWithAnEShow);
        System.out.println();
        System.out.println();


        // Building Map of TV shows and Corresponding CastLists
        Map<String, List<String>> showsMap = new HashMap<>();
        showsMap.put(anneWithAnEShow.getTitle(), anneWithAnEShow.getCast());
        showsMap.put(doctorWhoShow.getTitle(), doctorWhoShow.getCast());

        // Printing Television Show Map
        System.out.println("------");
        System.out.println("TV Shows and Their Casts");
        System.out.println("---");
        System.out.println(showsMap);
    }
}
