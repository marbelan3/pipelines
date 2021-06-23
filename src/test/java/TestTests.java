import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class TestTests {
    private boolean enabled;
    protected String sec;
    protected String choice;
    protected List<String> dataProviderStr;

    Logger logger = Logger.getLogger(getClass().getName());

    @BeforeClass
    public void beforeClass() {
        choice = System.getenv("CHOICE");
        sec = System.getenv("COUNT");
        dataProviderStr = Arrays.stream(System.getenv("DATA_PROVIDER_STRING").split(",")).map(String::trim).collect(Collectors.toList());
        enabled = Boolean.parseBoolean(System.getenv("IS_ENABLED"));
    }

    @Test
    public void test() {
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("******************* " + enabled + " ***************");
        System.out.println("******************* " + sec + " ***************");
        System.out.println("******************* " + choice + " ***************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        System.out.println("****************************************");
        Assert.assertEquals(choice, "FIVE");
        Assert.assertEquals(sec, "3");
        Assert.assertTrue(enabled);
    }

    @DataProvider
    public Object[][] getData() {
        return new Object[][]{
                {
                        dataProviderStr.stream().map(Integer::parseInt)
                }
        };
    }

    @Test(dataProvider = "getData")
    public void otherWaits(int sec) {
        Selenide.sleep(sec * 1000);
        System.out.println("**************** W A I T : " + sec + " S E C *****************");
        System.out.println("**************** W A I T : " + sec + " S E C *****************");
        System.out.println("**************** W A I T : " + sec + " S E C *****************");
        System.out.println("**************** W A I T : " + sec + " S E C *****************");
        System.out.println("**************** W A I T : " + sec + " S E C *****************");
    }


}
