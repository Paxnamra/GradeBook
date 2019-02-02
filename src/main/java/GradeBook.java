import java.util.*;
import java.util.stream.Stream;

public class GradeBook {

    public void showAllSubjectsAndMarks(Map map) {
        Iterator<Map.Entry<String, List<Integer>>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, List<Integer>> entry = entries.next();
            System.out.println("Subject: " + entry.getKey() + " || Marks: " + entry.getValue());
        }
    }

    public void calculateGradeBookAverage(Map map) {
        Iterator<List<Integer>> values = map.values().iterator();
        while (values.hasNext()) {
            List<Integer> value = values.next();
            System.out.println("Values are: " + value.toString());
        }
    }
}