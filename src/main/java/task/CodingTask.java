package task;

/**
 * Hello world!
 *
 */
public class CodingTask {
	public static String fizzBuzz(Integer number) {
		String returnValue = "";
		boolean isFizzNumber = isFizzNumber(number);
		boolean isBuzzNumber = isBuzzzNumber(number);
		if (isFizzNumber) {
			returnValue = "fizz";
		}
		if (isBuzzNumber) {
			returnValue += " buzz";
		} else if(!isBuzzNumber &&!isBuzzNumber ) {
			returnValue = number.toString();
		}
		return returnValue.trim();
	}
	
	private static boolean isFizzNumber(Integer numberToCheck){
		return checkNumber(numberToCheck,3);
	}
	
	private static boolean isBuzzzNumber(Integer numberToCheck){
		return checkNumber(numberToCheck,5);
	}

	private static boolean checkNumber(Integer numberToCheck,Integer divisorAndDigitToCheck) {
		boolean isMultiple = numberToCheck % divisorAndDigitToCheck == 0;
		String numberString  = numberToCheck.toString();
		boolean containsDigit = numberString.contains(divisorAndDigitToCheck.toString());
		return isMultiple || containsDigit; 		
	}
}
