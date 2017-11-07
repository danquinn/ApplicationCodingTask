package task;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CodingTaskTest 
    
{
    @Test
    public void fizzBuzz_InputIsNumberOne_OneIsReturned(){
    	//Act
    	String result = CodingTask.fizzBuzz(1);
    	String expected ="1";
    	//Assert
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_inputIsThree_fizzIsReturned(){
    	//Act
    	String result = CodingTask.fizzBuzz(3);
    	//Assert
    	String expected ="fizz";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_inputIsFive_buzzIsReturned(){
    	//Act
    	String result = CodingTask.fizzBuzz(5);
    	//Assert
    	String expected ="buzz";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_inputIsFifteen_fizzBuzzIsReturned(){
    	//Act
    	String result = CodingTask.fizzBuzz(15);
    	//Assert
    	String expected ="fizz buzz";
    	assertEquals(expected, result);;
    }
}
