import com.singtel.model.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class SolutionTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.out.println("@BeforAll - Executes");
    }

    @Before
    public void init() {
        System.out.println("@BeforeEach - Executes");
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void walk() {
        new Bird().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Chicken().walk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }
}
