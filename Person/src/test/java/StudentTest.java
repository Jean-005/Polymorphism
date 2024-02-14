import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StudentTest {

    Student student;

    @BeforeEach
    void setUp(){
        student = new Student();
        }

    @Test
    void hasMajor(){
        assertThat(student.hasMajor()).isEqualTo("Geography");
    }

    @Test
    void paysTuition(){
        assertThat(student.paysTuition()).isEqualTo(16000);
    }
}