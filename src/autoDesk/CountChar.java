package autoDesk;

import java.util.Scanner;

class CountCharacter {

	int charCount = 0;

	// Method to calculate the count of the character in the string
	int countMyChar(String str, char c) {

		for (int i = 0; i <= str.length() - 1; ++i) {
			if (str.charAt(i) == c) {
				++charCount;
			}
		}
		return charCount;
	}
}

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// This program will convert the string and the character to lowercase
		// If 'case' specific count is required then we need to remove the
		// toLowerCase method
		try {
			Scanner sc = new Scanner(System.in);
			boolean keepCounting = true;

			while (keepCounting) {
				// enter the string and character
				System.out.println("Enter the String ");
				String str = sc.nextLine();

				System.out.println("Enter the character you would like to be counted in the string");
				String strCh = sc.nextLine();
				char ch = strCh.toLowerCase().charAt(0);

				CountCharacter cc = new CountCharacter();

				// display the results
				System.out.println("The character \'" + ch + "\' occurs " + cc.countMyChar(str.toLowerCase(), ch)
						+ " times in the string \'" + str + "\'");

				// check if user wants to continue
				System.out.println("\nDo you want to keep counting? yes/no");

				if ((sc.nextLine().toLowerCase()).equals("yes")) {
					keepCounting = true;
				} else {
					keepCounting = false;
					System.out.println("Thanks for using this application!");
				}

			}
		} catch (StringIndexOutOfBoundsException expString) {
			//incase no character input is provided
			System.out.println("Value entered is not valid");

		}
		
		catch (Exception exp) {
			System.out.println("Application has encountered an error");
			throw exp;
		}
		

	}

}
