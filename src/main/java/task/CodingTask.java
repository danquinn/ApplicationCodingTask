package task;

/**
 * Hello world!
 *
 */
public class CodingTask {
	public static String fizzBuzz(Integer number) {
		String returnValue = "";
		boolean isFizzNumber = isFizzNumber(number);
		boolean isBuzzNumber = isBuzzNumber(number);
		boolean isDeluxeNumber= isDeluxeNumber(number);
		
		if (isFizzNumber) {
			returnValue = "fizz";
			if(isFizzDeluxeNumber(number)){
				returnValue +=" deluxe";
			}
		}
		if (isBuzzNumber) {
			returnValue += " buzz deluxe";
		}if(isBuzzNumber && isFizzNumber && isDeluxeNumber){
			returnValue+= getDeluxeNumberOutput(number);
		}else if(isDeluxeNumber){
			returnValue = getDeluxeNumberOutput(number);
		}
		else if(!isBuzzNumber &&!isFizzNumber &&!isDeluxeNumber) {
			returnValue = number.toString();
		}
		return returnValue.trim();
	}
	
	private static String getDeluxeNumberOutput(Integer number) {
		String returnValue = "";
		if(number%2==0){
			returnValue =  "deluxe";
		}else{
			returnValue = "fake deluxe"; 
		}
		return returnValue;
	}

	private static boolean isDeluxeNumber(Integer number) {
		String numberString = number.toString();
		String firstDigit = String.valueOf(numberString.charAt(0));
		String identicalCheck = numberString.replaceAll(firstDigit, "");
		return identicalCheck.length()==0 && number >10;
	}

	private static boolean isFizzNumber(Integer numberToCheck){
		return checkFizzOrBuzz(numberToCheck,3);
	}
	
	private static boolean isBuzzNumber(Integer numberToCheck){
		return checkFizzOrBuzz(numberToCheck,5);
	}
	
	private static boolean isBuzzDeluxeNumber(Integer numberToCheck){
		return checkFizzDeluxeOrBuzzDeluxe(numberToCheck,5);
	}
	
	private static boolean isFizzDeluxeNumber(Integer numberToCheck){
		return checkFizzDeluxeOrBuzzDeluxe(numberToCheck,3);
	}

	private static boolean checkFizzOrBuzz(Integer numberToCheck,Integer divisorAndDigitToCheck) {
		boolean isMultiple = isMultiple(numberToCheck, divisorAndDigitToCheck);
		boolean containsDigit = containsDigit(numberToCheck, divisorAndDigitToCheck);
		return isMultiple || containsDigit; 		
	}
	
	private static boolean checkFizzDeluxeOrBuzzDeluxe(Integer numberToCheck,Integer divisorAndDigitToCheck) {
		boolean isMultiple = isMultiple(numberToCheck, divisorAndDigitToCheck);
		if(isMultiple && numberToCheck==5){
			return true;
		}
		boolean containsDigit = containsDigit(numberToCheck, divisorAndDigitToCheck);
		return isMultiple && containsDigit; 		
	}

	private static boolean containsDigit(Integer numberToCheck, Integer divisorAndDigitToCheck) {
		String numberString  = numberToCheck.toString();
		boolean containsDigit = numberString.contains(divisorAndDigitToCheck.toString());
		return containsDigit;
	}

	private static boolean isMultiple(Integer numberToCheck, Integer divisorAndDigitToCheck) {
		boolean isMultiple = numberToCheck % divisorAndDigitToCheck == 0;
		return isMultiple;
	}
}
