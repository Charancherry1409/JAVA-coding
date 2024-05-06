//Write a program which does the following
//Take input for two integer variables a & b
//Output "Coding is Fun!" to the console if a is greater than b.
package learning_coding;
import java.util.Scanner;

public class if_statement {
		public static void main (String[] args)
		{
			// your code goes here
			Scanner read = new Scanner(System.in);
			int a = 25;
			int b = 20;
			if (a > b){
			    System.out.print("Coding is Fun!");
			}
		}
}