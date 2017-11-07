package task;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CodingTaskTest 
    
{
    private static final String EXPECTED_BUZZ_DELUXE_RESULT = "buzz deluxe";
	private static final String EXPECTED_FIZZ_RESULT = "fizz";
	private static final String EXPECTED_DELUXE_RESULT = "deluxe";
	private static final String EXPECTED_FAKE_DELUXE_RESULT = "fake deluxe";
	@Test
    public void fizzBuzz_numberOne_OneIsReturned(){
    	//Act
    	String result = CodingTask.fizzBuzz(1);
    	String expected ="1";
    	//Assert
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_multipleOfThreeDoesNotContainThree_fizzIsReturned(){
    	//Arrange
    	int multipleOfThreeDoesNotContainThree = 9;
    	//Act
		String result = CodingTask.fizzBuzz(multipleOfThreeDoesNotContainThree);
    	//Assert
    	String expected =EXPECTED_FIZZ_RESULT;
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_multipleOfFiveContainsFive_buzzIsReturned(){
    	//Arrange
    	int multipleOfFive = 5;
    	//Act
    	String result = CodingTask.fizzBuzz(multipleOfFive);
    	//Assert
		String expected =EXPECTED_BUZZ_DELUXE_RESULT;
    	assertEquals(expected, result);;
    }
    
    
    @Test
    public void fizzBuzz_containsThreeNotMultipleOfThree_fizzIsReturned(){
    	//Arrange
    	int containsThreeNonMultipleOfThree = 13;
    	//Act
		String result = CodingTask.fizzBuzz(containsThreeNonMultipleOfThree);
    	//Assert
    	String expteced = EXPECTED_FIZZ_RESULT;
    	assertEquals(expteced, result);;
    }
    
   
    
    @Test
    public void fizzBuzz_greaterThanTenAndDigitsAreIdenticalEvenNumner_deluxeIsReturned(){
    	//Arrange
    	int greatherThanTenDigitsAreIdentical =66;
    	//Act
		String result = CodingTask.fizzBuzz(greatherThanTenDigitsAreIdentical);
    	//Assert
    	String expected =EXPECTED_DELUXE_RESULT;
    	assertEquals(expected, result);
    }
    
    @Test
    public void fizzBuzz_greatherThanTenIdenticalDigitsOddNumber_fakeDeluxeIsReturned(){
    	//Arrange
    	int identicalDigitsGreatherThanTenOddNumber = 55;
    	//Act
		String result = CodingTask.fizzBuzz(identicalDigitsGreatherThanTenOddNumber);
    	//Assert
    	String expected =EXPECTED_FAKE_DELUXE_RESULT;
    	assertEquals(expected, result);;
    }
    
    
    
    @Test
    public void fizzBuzz_oddNumberMultipleOfThreeGreaterThanTenContainsThree_fizzDeluxeIsReturned1(){
    	//Arrange
    	int containsThreeMultipleOfThree = 333;
    	//Act
		String result = CodingTask.fizzBuzz(containsThreeMultipleOfThree);
    	//Assert
    	String expected =EXPECTED_FAKE_DELUXE_RESULT;
    	assertEquals(expected, result);;
    }
    
  
    
}
