import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Slf4j
public class TestTests {

    Logger logger = LoggerFactory.getLogger(getClass().getName());
    private static String choice_parameter_01;
    private static boolean isBooleanTrue;

    @BeforeClass
    public void beforeClass() {
        choice_parameter_01 = System.getenv("CHOICE_PARAMETER_01");
        isBooleanTrue = Boolean.getBoolean("IS_BOOLEAN_TRUE");
        logger.info(choice_parameter_01);
    }

    @Test
    public void test() {
        logger.info("\n*****************************************\n" + choice_parameter_01);
        Assert.assertEquals(choice_parameter_01, "ONE");
    }

    @Test
    public void test2() {
        logger.info("\n*****************************************\n" + isBooleanTrue);
        if (isBooleanTrue) {
            throw new RuntimeException("\n*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************");
        }
    }
}
