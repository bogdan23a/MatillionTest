import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testCompare() {

        assertEquals(Main.compare("da", "da"), 0);
        assertEquals(Main.compare("da", "nu"), 2);
    }

    @org.junit.jupiter.api.Test
    void testQuery() {
    }
}