package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {

    @Test
    public void testEquilateral(){
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(expected,actual);
    }

    @Test
    public void testScalene(){
        Type actual = Triangle.classify(10, 20,11);
        Type expected = SCALENE;
        assertEquals(expected,actual);
    }

    @Test
    public void testNegativeSide(){
        Type actual = Triangle.classify(-10, 20,30);
        Type expected = INVALID;
        assertEquals(expected,actual);
    }

    @Test
    public void testIsosceles(){
        Type actual = Triangle.classify(10, 10, 11);
        Type expected = ISOSCELES;
        assertEquals(expected,actual);
    }

    @Test
    public void testZeroSides(){
        Type actual = Triangle.classify(0,0,1);
        Type expected = INVALID;
        assertEquals(expected,actual);
    }

    @Test
    public void testInvalidSumFailIsoscelesSides(){
        Type actual = Triangle.classify(5,5,10);
        Type expected = INVALID;
        assertEquals(expected,actual);
    }

    @Test
    public void testInvalidSumFailDifferentSides(){
        Type actual = Triangle.classify(6,4,10);
        Type expected = INVALID;
        assertEquals(expected,actual);
    }

    @Test
    public void testEnums(){

    }
}
