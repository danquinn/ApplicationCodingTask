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
		boolean isDeluxeNumber= isDeluxeNumber(number);
		
		if (isFizzNumber) {
			returnValue = "fizz";
		}
		if (isBuzzNumber) {
			returnValue += " buzz";
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
