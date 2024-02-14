import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TeacherTest {

    Teacher teacher;

    @BeforeEach
    void setUp(){
        teacher = new Teacher();
    }

    @Test
    void hoursWorkedEachDay(){
        assertThat(teacher.hoursWorkedEachDay()).isEqualTo("8");
    }

    @Test
    void hasSalary(){
        assertThat(teacher.hasSalary()).isEqualTo(40000);
    }


}