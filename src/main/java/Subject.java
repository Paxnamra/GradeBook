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

    public double calculateAverage(Subject subject) {
        double average = 0.0d;
        if (subject.getSubjectMarks() != null) {
            int[] marksArray = subject.getSubjectMarks();
            int marksSum = 0;
            for (int i = 0; i < marksArray.length; i++) {
                int value = marksArray[i];
                marksSum = marksSum + value;
            }
            average = (float) marksSum / marksArray.length;
        } else {
            System.out.println("No values to calculate");
        }
        return Math.round(average*100)/100.0d;
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
