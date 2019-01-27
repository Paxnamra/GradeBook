import java.util.HashMap;
import java.util.Map;

public class GradeBook {

    Map<String, int[]> grades = new HashMap<String, int[]>();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GradeBook{");
        sb.append("grades=").append(grades);
        sb.append('}');
        return sb.toString();
    }
}
