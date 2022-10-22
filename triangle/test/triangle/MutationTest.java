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
    public void testTriangleInvalidM2(){
        //mutant number 2
    	// undetectable???
        Type expected = INVALID;
        Type actual = Triangle.classify(0, 1, 1);
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
    public void testTriangleInvalidM5(){
        //mutant number 5
    	// undetectable???
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(2,1,2);
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
    public void testTriangleInvalidM7(){
        //mutant number 7
    	// undetectable???
        Type expected = INVALID;
        Type actual = Triangle.classify(3,0,3);
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
    public void testEqualToIsoscelesM32(){
        //mutant number 32
    	// undetectable?
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(3,3,2);
        assertEquals(expected,actual);
    }
    
    
    @Test
    public void testEqualToIsoscelesM53(){
        //mutant number 53
    	// undetectable?
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(2,3,3);
        assertEquals(expected,actual);
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
    @Test
    public void testScaleneM79(){
        //mutant number 79
    	// undetectable?
        Type expected = SCALENE;
        Type actual = Triangle.classify(8,9,3);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSumM89(){
        //mutant number 89
        Type expected = INVALID;
        Type actual = Triangle.classify(1,8,9);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSumM50(){
        //mutant number 50
        Type expected = ISOSCELES;
        Type actual = Triangle.classify(2,3,3);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testTriangleInvalidM83(){
        Type expected = INVALID;
        Type actual = Triangle.classify(0,3,0);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testIsoscelesInvalidM84(){
        //mutant number 84
        Type expected = INVALID;
        Type actual = Triangle.classify(2,1,1);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testEquilateralM41(){
        //mutant number 41
        Type expected = EQUILATERAL;
        Type actual = Triangle.classify(1,1,1);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testEquilateral(){
        Type expected = EQUILATERAL;
        Type actual = Triangle.classify(10,10,10);
        assertEquals(expected,actual);
    }
    
    
    @Test
    public void testAllInvalid(){
        Type expected = INVALID;
        Type actual = Triangle.classify(-1,-1,-1);
        assertEquals(expected,actual);
    }
    
    
    @Test
    public void testZeros(){
        Type expected = INVALID;
        Type actual = Triangle.classify(0,0,0);
        assertEquals(expected,actual);
    }
    
    
    @Test
    public void testSumM81(){
        Type expected = INVALID;
        Type actual = Triangle.classify(4,2,1);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSums(){
        Type expected = INVALID;
        Type actual = Triangle.classify(2,4,1);
        assertEquals(expected,actual);
    }
    
    
    @Test
    public void testSumM73(){
        Type expected = INVALID;
        Type actual = Triangle.classify(2,9,7);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testSumM96(){
        Type expected = INVALID;
        Type actual = Triangle.classify(9,2,7);
        assertEquals(expected,actual);
    }
      
    
    @Test
    public void testEqualToIsoscelesM126(){
        //mutant number 126
        Type expected = INVALID;
        Type actual = Triangle.classify(3,6,3);
        assertEquals(expected,actual);
    }
    
    @Test
    public void testEqualToIsoscelesM(){
        Type expected = INVALID;
        Type actual = Triangle.classify(6,3,3);
        assertEquals(expected,actual);
    }
    
    
    



}
