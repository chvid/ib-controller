package ibcontroller;

import org.junit.Ignore;
import org.junit.Test;

import java.io.File;

@Ignore
public class StartIbControllerTest {
    @Test
    public void startIbControler() throws Exception {
        System.setProperty("user.dir", new File("work").getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
        IBController.main(new String[] { "src/main/etc/IBController.ini" });
        Thread.sleep(60000);
    }
}
