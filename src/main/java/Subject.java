import java.util.Arrays;
import java.util.List;

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
        if (!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum = sum + mark;
            }
            average = (float) sum / marks.size();
        } else {
            System.out.println("No values to calculate");
        }
        return Math.round(average * 100) / 100.0d;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject{");
        sb.append("subjectName='").append(subjectName).append('\'');
        sb.append(", subjectMarks=").append(subjectMarks);
        sb.append('}');
        return sb.toString();
    }
}
