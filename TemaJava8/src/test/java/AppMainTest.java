import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class AppMainTest {
    private AppMain appMain;

    @Before
    public void setUp() throws Exception {
        appMain = new AppMain();
        appMain.copyPersoane("src/main/resources/Persoane.txt");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void orderdByMonthStreamMonthCheck() throws IOException {
        appMain.orderdByMonthStream(3);
    }

    @Test
    public void orderdByMonthStreamVerify() throws FileNotFoundException {
        File file = new File("src/main/resources/PersoaneOrderd.txt");
        if (!file.exists()) throw new AssertionError();
    }
}