import org.testng.Assert;
import org.testng.annotations.*;

import java.util.logging.Logger;


public class TestTests {
    public static boolean enabled;
    public static String milliseconds;

    Logger logger = Logger.getLogger(getClass().getName());
    private static String choice;

    @BeforeClass
    public void beforeClass() {
        choice = System.getenv("CHOICE");
        milliseconds = System.getenv("COUNT");
        enabled = Boolean.parseBoolean(System.getenv("IS_ENABLED"));
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
        System.out.println("***************** " + choice + " *************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        Assert.assertEquals(choice, "FIVE");
        Assert.assertEquals(milliseconds, "1000");
        Assert.assertEquals(enabled, true);
    }


}
