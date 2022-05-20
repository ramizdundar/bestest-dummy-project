import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTest3 {
    @Before
    public void setUp() throws Exception {
        System.out.println("bu da ramizin");
    }

    @Test
    public void ramizDummyTest() {
        System.out.println("gec kalmayi severim");
        Assert.assertFalse(false);
    }
}
