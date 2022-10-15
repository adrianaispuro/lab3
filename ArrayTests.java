import static org.junit.Assert.*;
import java.lang.reflect.Array;
import org.junit.*;

public class ArrayTests {
	/* 
  @Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  */

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  
  
  //Test failed; element 1 is "4" instead of "2"
  @Test
  public void testReverseInPlaceLength2(){
    int[] input1 = {2,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,2}, input1);
  }
  
  
  
  //Test failed; element 0 is "0" instead of "6"
  @Test
  public void testReversedLength2(){
    int[] input1 = {3,6};
    assertArrayEquals(new int[]{6,3}, ArrayExamples.reversed(input1));
  }

  //Test failed, output = 0.0; should be 1.0
  /*
  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = {1.0,1.0,1.0};
    assertEquals(1.0, ArrayExamples.averageWithoutLowest(input1), 0.00000001);
  }
  */
}
