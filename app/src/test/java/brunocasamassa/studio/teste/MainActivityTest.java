package brunocasamassa.studio.teste;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import brunocasamassa.studio.teste.activities.MainActivity;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void httpRequestIsValid() throws Exception {
        assertNotNull(shadowOf(RuntimeEnvironment.application));

        int httpCode = Robolectric.buildActivity(MainActivity.class).create().get().getRequest();
        System.out.println("HTTP RESULT "+ httpCode);

        //range valido
        assertTrue(httpCode >= 200 && httpCode <= 300);
    }
}

