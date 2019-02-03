import java.util.List;

public class Subject extends Calculations {

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("subjectName='").append(subjectName).append('\'');
        sb.append(", subjectMarks=").append(subjectMarks);
        return sb.toString();
    }
}
