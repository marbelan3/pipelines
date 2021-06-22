import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestTests {
    public static boolean enabled = System.getProperty("enabled") != null && System.getProperty("enabled").equalsIgnoreCase("true");
    public static int milliseconds;

    Logger logger = Logger.getLogger(getClass().getName());
    private static String choice_parameter_01;
    private static boolean isBoolean;

    @BeforeClass
    public void beforeClass() {
        choice_parameter_01 = System.getenv("CHOICE_PARAMETER_01");
        milliseconds = Integer.parseInt(System.getProperty("milliseconds"));
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
            logger.info(
                    "\n******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n" +
                            "******************** S U C C E S S  *********************\n");
        }
        Assert.assertTrue(isBoolean, "The boolean parameter is 'F A L S E'");
    }


    @Test
    public void browserTest(int millisec) {
        Selenide.open("https://google.com");
        if (enabled) {
            logger.info(
                    "\n******************** enabled - true  *********************\n" +
                            "\n******************** enabled - true  *********************\n" +
                            "\n******************** enabled - true  *********************\n" +
                            "\n******************** enabled - true  *********************\n" +
                            "\n******************** enabled - true  *********************\n" +
                            "\n******************** enabled - true  *********************\n" +
                            "\n******************** enabled - true  *********************\n" +
                            "\n******************** enabled - true  *********************\n");
        }

        Selenide.sleep(millisec);
        logger.info("Browser has been wait a " + millisec + " milliseconds");
    }
}
