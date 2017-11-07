package task;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CodingTaskTest 
    
{
    @Test
    public void fizzBuzz_numberOne_OneIsReturned(){
    	//Act
    	String result = CodingTask.fizzBuzz(1);
    	String expected ="1";
    	//Assert
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_multipleOfThree_fizzIsReturned(){
    	//Arrange
    	int multipleOfThree = 3;
    	//Act
		String result = CodingTask.fizzBuzz(multipleOfThree);
    	//Assert
    	String expected ="fizz";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_multipleOfFive_buzzIsReturned(){
    	//Arrange
    	int multipleOfFive = 5;
    	//Act
    	String result = CodingTask.fizzBuzz(multipleOfFive);
    	//Assert
    	String expected ="buzz";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_multipleOfThreeAndFive_fizzBuzzIsReturned(){
    	//Arrange
    	int multipleOfThreeAndFive = 15;
    	//Act
    	String result = CodingTask.fizzBuzz(multipleOfThreeAndFive);
    	//Assert
    	String expected ="fizz buzz";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_containsThreeNotMultipleOfThree_fizzIsReturned(){
    	//Arrange
    	int containsThreeNonMultipleOfThree = 13;
    	//Act
		String result = CodingTask.fizzBuzz(containsThreeNonMultipleOfThree);
    	//Assert
    	String expected ="fizz";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_containsThreeAndFiveNotMultipleOfEither_fizzBuzzIsReturned(){
    	//Arrange
    	int containsThreeAndFiveNotMultipleOfEither = 353;
    	//Act
		String result = CodingTask.fizzBuzz(containsThreeAndFiveNotMultipleOfEither);
    	//Assert
    	String expected ="fizz buzz";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_greaterThanTenAndDigitsAreIdenticalEvenNumner_deluxeIsReturned(){
    	//Arrange
    	int greatherThanTenDigitsAreIdentical =66;
    	//Act
		String result = CodingTask.fizzBuzz(greatherThanTenDigitsAreIdentical);
    	//Assert
    	String expected ="deluxe";
    	assertEquals(expected, result);;
    }
    
    @Test
    public void fizzBuzz_greatherThanTenIdenticalDigitsOddNumber_fizzBuzzDeluxeIsReturned(){
    	//Arrange
    	int identicalDigitsGreatherThanTenOddNumber = 55;
    	//Act
		String result = CodingTask.fizzBuzz(identicalDigitsGreatherThanTenOddNumber);
    	//Assert
    	String expected ="fake deluxe";
    	assertEquals(expected, result);;
    }
    
  
    
}
