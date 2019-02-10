import java.util.*;
import java.util.stream.Collectors;

public class GradeBook {

    public Map<String, Subject> getGradeBookExample() {
        Map<String, Subject> gradeBook = new HashMap<>();
        gradeBook.put("1.", new Subject("Astronomy", Arrays.asList(2,3,3,1,4)));
        gradeBook.put("2.", new Subject("History", Arrays.asList(3, 3, 3, 1, 2, 1)));
        gradeBook.put("3.", new Subject("Language Studies", Arrays.asList(5,3,2,1,2)));

        System.out.println("\nPrinting Grade Book: ");
        return gradeBook;
    }

    public void displayAllSubjectsAndMarks(Map inputMap) {
        Iterator<Map.Entry<String, List<Integer>>> entries = inputMap.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, List<Integer>> entry = entries.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public void calculateGradeBookAverage(Map inputMap) {
        List<Subject> mapToList = new ArrayList<Subject>(inputMap.values());

        mapToList.stream()
                .filter(g -> g.getSubjectMarks() != null)
                .flatMap(g -> g.getSubjectMarks().stream())
                .collect(Collectors.toList());

        mapToList.forEach(element -> System.out.println(element));
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GradeBook{");
        sb.append('}');
        return sb.toString();
    }
}
