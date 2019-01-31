import java.util.*;

public class DemoGradeBook {
    public static void main(String[] args) {

        Subject subject = new Subject("Mathematics");
        Subject subject1 = new Subject("Physics", new ArrayList<>(Arrays.asList(5, 3, 1, 5, 4)));
        Subject subject2 = new Subject("History");

        System.out.println(subject);
        System.out.println(subject1);
        
        subject.addSubjectMarks(new ArrayList<>(Arrays.asList(4, 1, 5, 3)));

        System.out.println("\n" + subject1 + " average: " + subject1.calculateAverage(subject1.getSubjectMarks()));
        System.out.println();
        //System.out.println( subject2 + " average: " + subject2.calculateAverage(subject2.getSubjectMarks())); <-- not handled NullPointerException

        Map<String, List<Integer>> grades = new HashMap<>();
        grades.put(subject1.getSubjectName(),subject1.getSubjectMarks());
        grades.put(subject.getSubjectName(),subject.getSubjectMarks());
        grades.put("Norwegian Language", new ArrayList<>(Arrays.asList(4, 4, 5, 5, 1)));
        grades.put(subject2.getSubjectName(), new ArrayList<>(Arrays.asList(0)));


        GradeBook gradeBook = new GradeBook();
        //GradeBook gradeList = new GradeBook(new HashMap<String, List<Subject>>());
        //gradeList.calculateGradeBookAverage(grades);
        System.out.println("\nGrade Book: ");
        gradeBook.allSubjectsAndMarks(grades);

        System.out.println("\nSubjects from Grade Book: " + grades.keySet());
        System.out.println("\nValues from Grade Book: " + grades.values());


    }
}
