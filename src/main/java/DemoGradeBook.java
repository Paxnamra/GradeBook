import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DemoGradeBook {
    public static void main(String[] args) {

        Subject subject = new Subject("Mathematics");
        Subject subject1 = new Subject("Physics", new int[]{5, 3, 1, 5, 4});
        Subject subject2 = new Subject("History");

        System.out.println(subject);
        System.out.println(subject1);

        subject.addSubjectMarks(new int[]{4, 1, 5, 3});

        System.out.println("\n" + subject1 + " average: " + subject1.calculateAverage(subject1));
        System.out.println();
        System.out.println( subject2 + " average: " + subject2.calculateAverage(subject2));

        Map<String, String> grades = new HashMap<>();
        grades.put(subject1.getSubjectName(), Arrays.toString(subject1.getSubjectMarks()));
        grades.put(subject.getSubjectName(), Arrays.toString(subject.getSubjectMarks()));
        grades.put("Economy", "[3, 2, 1, 5, 3]");
        grades.put("Norwegian Language", "[3, 5, 5, 4, 3]");
        grades.put(subject2.getSubjectName(), "[0]");

        GradeBook gradeBook = new GradeBook();
        System.out.println("\nGrade Book: ");
        gradeBook.allSubjectsAndMarks(grades);

        System.out.println("\nSubjects from Grade Book: " + grades.keySet());
        System.out.println("\nValues from Grade Book: " + grades.values());






    }
}
