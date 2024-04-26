import java.util.Scanner;
public class InputFromKeyBoard {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String strName= keyboard.nextLine();
		System.out.println("Enter your age: ");
		int iAge= keyboard.nextInt();
		System.out.println("Enter your height: ");
		double iheight= keyboard.nextDouble();
		System.out.println("Mr/Mrs." + strName +", "+ iAge +"years old. "+"Your height is "+ iheight+".");	
	}
}
