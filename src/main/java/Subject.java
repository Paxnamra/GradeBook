import java.util.List;
import java.lang.NullPointerException;

public class Subject {

    private String subjectName;
    private List<Integer> subjectMarks;

    public String getSubjectName() {
        return subjectName;
    }

    public List<Integer> getSubjectMarks() {
        return subjectMarks;
    }

    public void addSubjectMarks(List<Integer> subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject(String subjectName, List<Integer> subjectMarks) {
        this(subjectName);
        this.subjectMarks = subjectMarks;
    }

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

    @Override
    public String toString() {
        return subjectName + subjectMarks;
    }
}
