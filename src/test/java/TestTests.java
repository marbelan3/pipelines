import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class TestTests {
    private boolean enabled;
    protected String sec;
    protected String choice;
    protected String dataProviderStr;

//    Logger logger = Logger.getLogger(getClass().getName());

    @BeforeClass
    public void beforeClass() {
        choice = System.getenv("CHOICE");
        sec = System.getenv("COUNT");
//        dataProviderStr = System.getenv("DATA_PROVIDER_STRING");
        dataProviderStr = "1 ONE,2 TWO,3 THREE";
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
        System.out.println("******************* " + dataProviderStr + " ***************");
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
        List<Object[]> list = new ArrayList<>();
        List<String> collect = Arrays.stream(dataProviderStr.split(",")).collect(Collectors.toList());
        for (String s : collect) {
            list.add(new Object[]{new SecAndDescribe(Integer.parseInt(s.trim().split(" ")[0].trim()), s.trim().split(" ")[1].trim())});
        }
        return list.toArray(new Object[list.size()][]);
    }


    @Test(dataProvider = "getData")
    public void otherWaits(SecAndDescribe secObj) {
        Selenide.sleep(secObj.getSec() * 1000);
        System.out.println("**************** W A I T : " + secObj.sec + " S E C ************ " + secObj.describe + " ***********");
        System.out.println("**************** W A I T : " + secObj.sec + " S E C ************ " + secObj.describe + " ***********");
        System.out.println("**************** W A I T : " + secObj.sec + " S E C ************ " + secObj.describe + " ***********");
        System.out.println("**************** W A I T : " + secObj.sec + " S E C ************ " + secObj.describe + " ***********");
        System.out.println("**************** W A I T : " + secObj.sec + " S E C ************ " + secObj.describe + " ***********");
        System.out.println("**************** W A I T : " + secObj.sec + " S E C ************ " + secObj.describe + " ***********");

    }
}
