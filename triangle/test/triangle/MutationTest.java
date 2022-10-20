package triangle;

import org.junit.Test;
import static org.junit.Assert.*;
import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

public class MutationTest extends BranchTest{
    /*
    Some mutation tests lead to a cascading effect in which more than 1 mutation is being killed.
     */
    //Contributors, please maintain order of mutants in which you are killing them.

    @Test
    public void testLessThan1M1(){
        //mutant number 1.
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(1, 2, 2);
        assertEquals(expected,actual);
    }

    @Test
    public void testEqualityRemovedM3(){
        //mutant number 3.
        Type expected = INVALID;
        Type actual = Triangle.classify(0, 2, 2);
        assertEquals(expected,actual);
    }

    @Test
    public void testEqualToZeroM4(){
        //mutant number 4.
        Type expected = INVALID;
        Type actual = Triangle.classify(-1, 2, 2);
        assertEquals(expected,actual);
    }

    @Test
    public void testLessThan1M6(){
        //mutant number 6.
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(2, 1, 2);
        assertEquals(expected,actual);
    }

    @Test
    public void testEqualityRemovedM8(){
        //mutant number 8.
        Type expected = INVALID;
        Type actual = Triangle.classify(2, 0, 2);
        assertEquals(expected,actual);
    }

    @Test
    public void testEqualToZeroM9(){
        //mutant number 9.
        Type expected = INVALID;
        Type actual = Triangle.classify(2, -1, 2);
        assertEquals(expected,actual);
    }

    @Test
    public void testNotEqualToM11(){
        //mutant number 11.
        //TODO: is this undetectable? Most probably.
        Type expected = INVALID;
        Type actual = Triangle.classify(0,2,2);
        assertEquals(expected,actual);
    }

    @Test
    public void testLessThan1M15(){
        //mutant number 15
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(2,2,1);
        assertEquals(expected,actual);

    }

    @Test
    public void testM16(){
        //mutant number 16, prob 17 as well.
        Type expected = INVALID;
        Type actual = Triangle.classify(2,2,0);
        assertEquals(expected,actual);
    }

    @Test
    public void testEqualToZeroM18(){
        //mutant number 18
        Type expected = INVALID;
        Type actual = Triangle.classify(2, 2, -1);
        assertEquals(expected,actual);
    }

    @Test
    public void testM20(){
        //TODO: undetectable? Not sure
    }

    @Test
    public void testTriangleConditionM59(){
        //mutant number 59.
        //TODO: undetectable most likely.
    }

    @Test
    public void testTriangleSumM67(){
        //mutant number 67
        Type expected = INVALID;
        Type actual = Triangle.classify(1, 2, 4);
        assertEquals(expected,actual);
    }




}
