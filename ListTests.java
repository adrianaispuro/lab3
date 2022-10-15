import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<String>();
        input1.add("this");
        input1.add("chair");
        input1.add("chilled");
        input1.add("ghost");
        input1.add("hills");

        List<String> input2 = new ArrayList<String>();
        input2.add("this");
        input2.add("chilled");
        input2.add("hills");
        assertEquals(input2, ListExamples.filter(input1, new StringCheck()));
    }
}
