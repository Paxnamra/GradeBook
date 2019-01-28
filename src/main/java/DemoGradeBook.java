import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DemoGradeBook {
    public static void main(String[] args) {

        Subject subject = new Subject("Mathematics");
        Subject subject1 = new Subject("Physics", new int[]{5, 3, 1, 5, 4});

        System.out.println(subject);
        System.out.println(subject1);

        subject.addSubjectMarks(new int[]{4, 1, 5, 3});
        System.out.println(subject);

        Map<String, String> grades = new HashMap<>();
        grades.put(subject1.getSubjectName(), Arrays.toString(subject1.getSubjectMarks()));
        grades.put(subject.getSubjectName(), Arrays.toString(subject.getSubjectMarks()));

        System.out.println("\nGrade Book: ");
        System.out.println(grades);

        System.out.println("\nSubjects from Grade Book: " + grades.keySet());

        System.out.println("\nValues from Grade Book: ");
        System.out.println(grades.values());





    }
}
