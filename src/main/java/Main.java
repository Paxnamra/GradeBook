import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Subject subject = new Subject("Mathematics");
        Subject subject1 = new Subject("Physics", new int[]{5, 3, 1, 5});

        System.out.println(subject);
        System.out.println(subject1);

        subject.addSubjectMarks(new int[]{4, 1, 5, 3});
        System.out.println(subject);

        Map<Subject, int[]> grades = new HashMap<Subject, int[]>();
        grades.put(subject1, subject1.getSubjectMarks());
        grades.put(subject, subject.getSubjectMarks());

        System.out.println("\nGrade Book: ");
        System.out.println(grades);

    }
}
