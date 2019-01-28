import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.HashMap;
import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class GradeBookUnitTests {

    @Mock
    Subject subject;
    int[] marks;
    Map<String,int[]> gradeBook;

    @Test
    void shouldCreateOnlySubject() {
        Subject subject = new Subject("Physics");
        Assertions.assertNotNull(subject);
    }

    @Test
    void shouldCreateSubjectWithMark() {
        Subject subject = new Subject("Physics", new int[]{3,5,1,4});
        Assertions.assertNotNull(subject);
    }

    @Test
    void shouldNotCreateSubjectWithMarksHigherThan5() {

    }

    @Test
    void shouldAddMarkToSubject() {
        subject.addSubjectMarks(new int[]{3,4,1});
        Assertions.assertEquals(subject,subject);
    }

    @Test
    void shouldNotAddMarkToSubjectHigherThan5() {

    }

    @Test
    void shouldCalculateSubjectAverage() {

    }

    @Test
    void shouldCreateGradeBook() {
        Map<String, int[]> gradeBook = new HashMap<>();
        Assertions.assertNotNull(gradeBook);
    }

    @Test
    void shouldAddSubjectToGradeBook() {

    }

    @Test
    void shouldGetSubjectFromGradeBook() {

    }

    @Test
    void shouldGetAllSubjectsFromGradeBook() {

    }

    @Test
    void shouldDeleteSubjectFromGradeBook() {

    }

    @Test
    void shouldChangeMarkInGradeBook() {

    }

    @Test
    void shouldCalculateGradeBookAverage() {

    }
}
