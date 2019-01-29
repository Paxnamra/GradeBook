import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GradeBook {

    //private Subject key;
    //private Subject value;
    //private Map<String, String> grades;

    /*
    GradeBook() {
        new HashMap<String, String>();
    }
    */

    public void allSubjectsAndMarks(Map grades) {
        Iterator<Map.Entry<String, String>> entries = grades.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<String, String> entry = entries.next();
            System.out.println("Subject: " + entry.getKey() + " || Marks: " + entry.getValue());
        }
    }

    public double calculateGradeBookAverage(Map grades) {
        return 0.0d;
    }

    public void put(Subject key, Subject value) {
        //grades.put(key.getSubjectName(), Arrays.toString(value.getSubjectMarks()));
    }
}

