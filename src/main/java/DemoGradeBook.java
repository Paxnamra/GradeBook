import java.util.*;

public class DemoGradeBook {
    public static void main(String[] args) {

        GUIPanel guiPanel = new GUIPanel();

        System.out.println("Printing singular subjects: ");

        Subject subject = new Subject("Mathematics");
        Subject subject1 = new Subject("Physics", new ArrayList<>(Arrays.asList(5, 3, 1, 5, 4)));
        Subject subject2 = new Subject("History", Arrays.asList(5,3,2,1,2));

        System.out.println(subject);
        System.out.println(subject1);

        subject.addSubjectMarks(new ArrayList<>(Arrays.asList(4, 1, 5, 3)));

        System.out.println("\n" + subject1 + " average: " + subject1.calculateAverage(subject1.getSubjectMarks()));
        System.out.println();
        System.out.println(subject2 + " average: " + subject2.calculateAverage(subject2.getSubjectMarks()));

        GradeBook gradeBook = new GradeBook();

        Map<String, Subject> grades = gradeBook.getGradeBookExample();
        gradeBook.displayAllSubjectsAndMarks(grades);

        gradeBook.calculateGradeBookAverage(grades);

        System.out.println("\nSubjects from Grade Book: " + grades.keySet());
        System.out.println("Values from Grade Book: " + grades.values());

    }
}
