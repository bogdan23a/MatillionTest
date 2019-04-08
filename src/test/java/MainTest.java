import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCompare() throws Exception{

        assertEquals(Main.compare("", ""), 0);
        assertEquals(Main.compare("yes","noo"), 3);
        assertEquals(Main.compare("D23W8MCCIZQOP9", "D236862CEZQOPS"), 5);
    }
}