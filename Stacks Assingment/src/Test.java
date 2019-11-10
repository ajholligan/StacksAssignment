import java.util.Scanner;
/**
 * 
 */

/**
 * @author aholl
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test test = new Test();		
		test.displayMenu();
	}
		
	

	RPNCalc rpnCalc; 
	
	public Test()
	{
		rpnCalc = new RPNCalc();
	}
	
	
	/**
	 * tester method
	 */
	public void testPush()
	
	{ 
		
		rpnCalc.calculation("2 2 + 1 -");
		rpnCalc.calculation("5 0 /");
		rpnCalc.calculation("1 + 1");
		rpnCalc.calculation("2 + 2 3");
		rpnCalc.calculation("1 +");
		rpnCalc.calculation("2 2 +");
		rpnCalc.calculation("1 1 -");
		rpnCalc.calculation("3 4 *");
		rpnCalc.calculation("4 2 /");
		
	}
	
	/**
	 * Displays and takes in answer from menu
	 */
	public void displayMenu()
	{ 
		do
		{
			System.out.println("Please enter your calculation in Reverse Polish Notation (RPN) sepereating each character with a space e.g. 2 2 + 1 - or type 'exit' to leave");
			Scanner s = new Scanner(System.in);
			String calculation = s.nextLine();
			if(calculation.equals("exit"))
			{
				break;
			}
			
				rpnCalc.calculation(calculation);
				
		}
		while (1==1);
	
	}
	
}
