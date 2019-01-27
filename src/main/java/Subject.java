import java.util.Arrays;

public class Subject {

    private String subjectName;
    private int[] subjectMarks;

    public String getSubjectName() {
        return subjectName;
    }

    public int[] getSubjectMarks() {
        return subjectMarks;
    }

    public void addSubjectMarks(int[] subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public Subject(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject(String subjectName, int[] subjectMarks) {
        this(subjectName);
        this.subjectMarks = subjectMarks;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Subject{");
        sb.append("subjectName='").append(subjectName).append('\'');
        sb.append(", subjectMarks=").append(Arrays.toString(subjectMarks));
        sb.append('}');
        return sb.toString();
    }
}
