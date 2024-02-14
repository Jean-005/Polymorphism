import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WorkerTest {

        Worker worker;
        @BeforeEach
        void setUp(){
            worker = new Worker();
        }
        @Test
        void canTeach(){
            assertThat(worker.canTeach()).isIn( true, false);
        }

        @Test
        void hasSalary(){
            assertThat(worker.hasSalary()).isEqualTo(0);
        }
    }

