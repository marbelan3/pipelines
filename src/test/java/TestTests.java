import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestTests {
    Logger logger = Logger.getLogger(getClass().getName());
    private static String choice_parameter_01;
    private static boolean isBooleanTrue;

    @BeforeClass
    public void beforeClass() {

        Logger.getLogger("hudson.plugins.git.GitStatus").setLevel(Level.SEVERE);
        Logger.getLogger("hudson.security.csrf.CrumbFilter").setLevel(Level.SEVERE);
        choice_parameter_01 = System.getenv("CHOICE_PARAMETER_01");
        isBooleanTrue = Boolean.getBoolean("IS_BOOLEAN_TRUE");
        logger.info("choice_parameter_01" + choice_parameter_01);
    }

    @Test
    public void test() {
        logger.info("\n*****************************************\n" + choice_parameter_01);
        logger.severe("\n*****************************************\n" + choice_parameter_01);
        Assert.assertEquals(choice_parameter_01, "ONE");
    }

    @Test
    public void test2() {

        logger.info("\n*****************************************\n" + isBooleanTrue);
        logger.severe("\n*****************************************\n" + isBooleanTrue);
        if (isBooleanTrue) {
            System.out.println("123123123123123");
            throw new RuntimeException("\n*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************\n" +
                    "*****************************************");
        }
        Assert.assertTrue(isBooleanTrue);
    }
}
