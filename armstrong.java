import java.util.Scanner;

/**
 * A utility to check if a given number is armstrong or not. Armstrong number is
 * a number that is equal to the sum of cubes of its digits for example 0, 1,
 * 153, 370, 371, 407 etc. For example 153 = 1^3 + 5^3 +3^3
 * armstrong دا عباره عن رقم لو فككتو مثلا الرقم 371 دا مكون من 3 و 7 و 1 لو عملتا 3 اس 3 و 7 اس 3 و 1 اس 3 بدينا مجموع مركب الرقم وهو نفس الرقم 371
 * 
 * @author asim altayb
 *github/asim-altayb
 * 
 */
public class Armstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the number");
		int n = scan.nextInt();
		boolean isArmstrong = checkIfANumberIsAmstrongOrNot(n);
		if (isArmstrong) {
			System.out.println("the number is armstrong");
		} else {
			System.out.println("the number is not armstrong");
		}
	}

	/**
	 * Checks whether a given number is an armstrong number or not. Armstrong
	 * number is a number that is equal to the sum of cubes of its digits for
	 * example 0, 1, 153, 370, 371, 407 etc.
	 * 
	 * @param number
	 * @return boolean
	 */
	public static boolean checkIfANumberIsAmstrongOrNot(int number) {
		int remainder, sum = 0, temp = 0;
		temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = sum + (remainder * remainder * remainder);
			number = number / 10;
		}
		if (sum == temp) {
			return true;
		} else {
			return false;
		}

	}
}
