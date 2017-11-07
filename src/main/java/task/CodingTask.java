package task;

/**
 * Hello world!
 *
 */
public class CodingTask {
	public static String fizzBuzz(Integer number) {
		String returnValue = "";
		boolean multipleOfThree = number % 3 == 0;
		boolean multipleOfFive = number % 5 == 0;
		if (multipleOfThree) {
			returnValue = "fizz";
		}
		if (multipleOfFive) {
			returnValue += " buzz";
		} else if(!multipleOfFive && !multipleOfThree) {
			returnValue = number.toString();
		}
		return returnValue.trim();
	}
}
