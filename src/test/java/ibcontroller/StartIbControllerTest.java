package ibcontroller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class StartIbControllerTest {
    /*
    @Before
    public void setup() {
        System.setProperty("sun.java2d.noddraw", "true");
        System.setProperty("swing.boldMetal", "false");
        System.setProperty("sun.locale.formatasdefault", "true");
    }
    */

    @Test
    public void startIbControler() throws Exception {
        IBController.main(new String[] { "resources/IBController.ini" });
        Thread.sleep(60000);
    }
}
