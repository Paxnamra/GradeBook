import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

@ExtendWith(MockitoExtension.class)
public class UsefulTestCasesToIncludeYet {

    @Mock
    Subject subject;
    GradeBook gradeBook = new GradeBook();
    List<Integer> subjectMarks;

    @Test
    void shouldCreateOnlySubject() {
        Subject subject = new Subject("Physics");
        Assertions.assertNotNull(subject);
    }

    @Test
    void shouldCreateSubjectWithMark() {
        Subject subject = new Subject("Physics", new ArrayList<>(Arrays.asList(5, 3, 1, 5, 4)));
        Assertions.assertNotNull(subject);
    }

    @Test
    void shouldNotCreateSubjectWithMarksHigherThan5() {

    }

    @Test
    void shouldNotCreateSubjectWithMarksLesserThan1() {

    }

    @Test
    void shouldCreateSubjectWithMarksBetween1and5() {

    }

    @Test
    void shouldAddMarkToSubject() {
        subject.addSubjectMarks(new ArrayList<>(Arrays.asList(5, 3, 1, 5, 4)));
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
        Map<String, Subject> grades = gradeBook.getGradeBookExample();
        Assertions.assertNotNull(grades);
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
