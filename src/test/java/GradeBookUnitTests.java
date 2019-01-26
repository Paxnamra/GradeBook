import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class GradeBookUnitTests {

    @Mock
    Subject subject;

    @Test
    void shouldCreateOnlySubject() {
        new Subject("Mathematics");
        Assertions.assertEquals(subject, subject);
    }

    @Test
    void shouldCreateSubjectWithMark() {

    }

    @Test
    void shouldNoTCreateSubjectWithMarksHigherThan5() {

    }

    @Test
    void shouldAddMarkToSubject() {

    }

    @Test
    void shouldNotAddMarkToSubjectHigherThan5() {

    }

    @Test
    void shouldCalculateSubjectAverage() {

    }

    @Test
    void shouldCreateGradeBook() {

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
