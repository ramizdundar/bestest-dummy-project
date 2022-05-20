import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest1 {
    @Before
    public void setUp() throws Exception {
        System.out.println("hello world, i'm ufuk");
    }

    @Test
    public void ufukDummyTest1() {
        System.out.println("kulagligim neden boyle benim");
        assertFalse(true);
    }
}
