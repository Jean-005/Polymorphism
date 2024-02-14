import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CaretakerTest {
        Caretaker caretaker;
        @BeforeEach
        void setUp(){
            caretaker = new Caretaker();
        }

        @Test
        void hoursWorkedEachDay(){
            assertThat(caretaker.hoursWorkedEachDay()).isEqualTo("3");
        }

        @Test
        void hasSalary(){
            assertThat(caretaker.hasSalary()).isEqualTo(12000);
        }


    }
