import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static void main(String[] args) {
		// If you want to write your own tests, do so here. (Do not modify
		// JUnitTests.java.) To run this method in Eclipse, right-click
		// Java1Review.java in the Package Explorer and select "Run As" >
		// "Java Application" from the context menu.
	}
	
	public static double divide(double num1, double num2) {
		return num1/num2;
	}
	
	public static int divide(int num1, int num2) {
		return num1/num2;
	}
	
	public static boolean isDivisibleBy7(int num) {
		if(num % 7 == 0)
			return true;
		else
			return false;
	}
	
	public static String main(String words) {
		String word = "Overloaded main method was passed \"" + words + "\".";
		return word;
		
	}
		public static int findMin(int num1, int num2, int num3) {
	
		if(num1 < num2 && num1 < num3) {
			return num1;
		}
		else if(num2 < num1 && num2 < num3) {
			return num2;
		}
		else
			return num3;
	}
	
	public static int findMin(int[] list) {
		int min = list[0];
		for(int i = 1; i < list.length; i++) {
			if(list[i] < min)
				min = list[i];
		}	
		return min;
	}
	
	public static double average(int[] list) {
		double sum = 0;
		for(int i = 0; i < list.length; i++)
		{
			sum += list[i];
		}
		return sum/list.length;
	}
	
	public static String[] toLowerCase(String[] strings) {
		for(int i = 0; i < strings.length; i++)
		{
			strings[i] = strings[i].toLowerCase();
		}
		return strings;
	}
	
	public static String[] toLowerCaseCopy(String[] strings) {
		String[] newStrings = new String[strings.length];
		
		for(int i = 0; i < strings.length; i++)
		{
			newStrings[i] = strings[i].toLowerCase();
		}
		return newStrings;
	}
	
	public static int[] removeDuplicates(int[] list) {
		for(int i = 0; i < list.length; i++)
		{
			int num = list[i];
			
			for(int j = i+1; j < list.length; j++)
			{	
				if(list[j] == num)
				{
					list[i] = 0;
					list[j] = 0;
				}
			}
		}
		return list;
	}

}
