import java.util.*;

public class GradeBook {

    public void allSubjectsAndMarks(Map map) {
        Iterator<Map.Entry<String, List<Integer>>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, List<Integer>> entry = entries.next();
            System.out.println("Subject: " + entry.getKey() + " || Marks: " + entry.getValue());
        }
    }

    public double calculateGradeBookAverage(Map map) {
        return 0.0d;
    }
}