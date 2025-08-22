import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class SampleTest {
    @Test(invocationCount = 3)
    public void sampleTest(){
        assertTrue(true);
    }
}
