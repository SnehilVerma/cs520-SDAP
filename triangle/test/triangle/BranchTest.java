
package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

public class BranchTest extends TriangleTest{

    @Test
    public void testIsoscelesBranch1(){
        Type actual = Triangle.classify(10,10,15);
        Type expected = ISOSCELES;
        assertEquals(expected,actual);
    }

    @Test
    public void testIsoscelesBranch2(){
        Type actual = Triangle.classify(10,15,10);
        Type expected = ISOSCELES;
        assertEquals(expected,actual);
    }

    @Test
    public void testIsoscelesBranch3(){
        Type actual = Triangle.classify(15,10,10);
        Type expected = ISOSCELES;
        assertEquals(expected,actual);
    }

}
