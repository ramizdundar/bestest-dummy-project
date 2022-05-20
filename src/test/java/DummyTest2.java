import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTest2 {
    @Before
    public void setUp() throws Exception {
        System.out.println("Bu cagrinin testi");
    }

    @Test
    public void cagriDummyTest() {
        System.out.println("ben satmayi severim");
        Assert.assertFalse(true);
    }
}
