import java.util.*;
import java.util.stream.Collectors;
import java.lang.NullPointerException;

public class Calculations {

    public double calculateAverage(List<Integer> marks) {
        double average = 0.0d;
        Integer sum = 0;

        try {
            if (!marks.isEmpty()) {
                for (Integer mark : marks) {
                    sum = sum + mark;
                }
                average = (float) sum / marks.size();
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException nPointer) {
            System.out.println("No values to calculate");
        }
        return Math.round(average * 100) / 100.0d;
    }

    public void showAllSubjectsAndMarks(Map map) {
        Iterator<Map.Entry<String, List<Integer>>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, List<Integer>> entry = entries.next();
            System.out.println("Subject: " + entry.getKey() + " || Marks: " + entry.getValue());
        }
    }

    public void calculateGradeBookAverage(Map map) {
        List<Subject> str = (List<Subject>) map.values().stream()
                .collect(Collectors.toList());
        System.out.println("Values are: " + str);
    }
}
