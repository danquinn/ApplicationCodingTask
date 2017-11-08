package task;

/**
 * Hello world!
 *
 */
public class CodingTask {

	public static String fizzBuzz(Integer number) {
		String returnValue = "";
		boolean fizzNumber = isFizzNumber(number);
		boolean buzzNumber = isBuzzNumber(number);
		boolean isDeluxeNumber= isDeluxeNumber(number);
		boolean fizzDeluxe = isFizzDeluxeNumber(number);
		boolean buzzDeluxe = isBuzzDeluxeNumber(number);
		
		if (fizzNumber) {
			returnValue = "fizz";
		}else if(fizzDeluxe){
			returnValue = "fizz deluxe";
		}
		if (buzzNumber) {
			returnValue += " buzz";
		}else if(buzzDeluxe){
			returnValue += " buzz deluxe";
		}else if(isDeluxeNumber){
			if(fizzNumber && buzzNumber ){
				returnValue+= getDeluxeNumberOutput(number);
			}else{
				returnValue = getDeluxeNumberOutput(number);
			}
		}
		else if(!buzzDeluxe &&!fizzDeluxe &&!isDeluxeNumber &&!fizzNumber&&!buzzNumber) {
			returnValue = numberToString(number);
		}
		return returnValue.trim();
	}

	/**
	 * @param number
	 * @return
	 */
	protected static String numberToString(Integer number) {
		return number.toString();
	}

	/**
	 * @param number
	 * @return
	 */
	protected static boolean isFizzNumber(Integer number) {
		return containsDigit(number, 3)^isMultiple(number, 3);
	}
	
	/**
	 * @param number
	 * @return
	 */
	protected static boolean isBuzzNumber(Integer number) {
		return containsDigit(number, 5)^isMultiple(number, 5);
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
		boolean isDeluxe;
		if (number <= 10) {
			isDeluxe = false;
		} else {
			String numberString = numberToString(number);
			String firstDigit = String.valueOf(numberString.charAt(0));
			String identicalCheck = numberString.replaceAll(firstDigit, "");
			isDeluxe = identicalCheck.length() == 0;
		}
		return isDeluxe;
	}

	private static boolean isFizzDeluxeNumber(Integer numberToCheck){
		return checkFizzDeluxeOrBuzzDeluxe(numberToCheck,3);
	}
	
	private static boolean isBuzzDeluxeNumber(Integer numberToCheck){
		return checkFizzDeluxeOrBuzzDeluxe(numberToCheck,5);
	}

	private static boolean checkFizzDeluxeOrBuzzDeluxe(Integer numberToCheck,Integer divisorAndDigitToCheck) {
		boolean isMultiple = isMultiple(numberToCheck, divisorAndDigitToCheck);
		boolean containsDigit = containsDigit(numberToCheck, divisorAndDigitToCheck);
		return isMultiple && containsDigit; 		
	}

	private static boolean containsDigit(Integer numberToCheck, Integer divisorAndDigitToCheck) {
		String numberString  = numberToString(numberToCheck);
		boolean containsDigit = numberString.contains(numberToString(divisorAndDigitToCheck));
		return containsDigit;
	}

	private static boolean isMultiple(Integer numberToCheck, Integer divisorAndDigitToCheck) {
		boolean isMultiple = numberToCheck % divisorAndDigitToCheck == 0;
		return isMultiple;
	}
}
