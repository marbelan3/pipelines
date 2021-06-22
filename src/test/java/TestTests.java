import org.testng.Assert;
import org.testng.annotations.*;

import java.util.logging.Logger;


public class TestTests {
    public static boolean enabled;
    public static String milliseconds;

    Logger logger = Logger.getLogger(getClass().getName());
    private static String choice_parameter_01;

    @BeforeClass
    public void beforeClass() {
        choice_parameter_01 = System.getenv("CHOICE_PARAMETER_01");
        milliseconds = System.getProperty("PERSON");
        enabled = Boolean.parseBoolean(System.getProperty("IS_ENABLED"));
    }

    @Test
    public void test() {
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("***************** " + enabled + " *************");
        System.out.println("***************** " + milliseconds + " *************");
        System.out.println("***************** " + choice_parameter_01 + " *************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");

        logger.info("\n*****************************************\n" + choice_parameter_01);
        Assert.assertEquals(choice_parameter_01, "ONE");
    }


}
