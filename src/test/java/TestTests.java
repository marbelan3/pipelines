import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestTests {
    Logger logger = Logger.getLogger(getClass().getName());
    private static String choice_parameter_01;
    private static boolean isBoolean;

    @BeforeClass
    public void beforeClass() {
        choice_parameter_01 = System.getenv("CHOICE_PARAMETER_01");
        isBoolean = Boolean.parseBoolean(System.getenv("isBoolean"));
        logger.info("choice_parameter_01" + choice_parameter_01);
    }

    @Test
    public void test() {
        logger.info("\n*****************************************\n" + choice_parameter_01);
        Assert.assertEquals(choice_parameter_01, "ONE");
    }

    @Test
    public void test2() {

        logger.info("\n*****************************************\n" + isBoolean);
        if (isBoolean) {
            System.out.println("123123123123123");
            throw new RuntimeException(
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************");
        }
        Assert.assertTrue(isBoolean, "The boolean parameter is 'F A L S E'");
    }
}
