package ibcontroller;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.File;

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
        System.setProperty("user.dir", new File("work").getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
        IBController.main(new String[] { "resources/IBController.ini" });
        Thread.sleep(60000);
    }
}
