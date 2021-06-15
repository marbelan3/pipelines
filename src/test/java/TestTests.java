import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class TestTests {

     Logger logger = LoggerFactory.getLogger(getClass().getName());

    @BeforeClass
    public void beforeClass(){
        String choice_parameter_01 = System.getenv("CHOICE_PARAMETER_01");
        logger.info(choice_parameter_01);
    }
}
