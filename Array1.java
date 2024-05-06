
//Write a program which does the following
//
//The 3rd month in the given list is incorrect
//Update the 3rd month in the given array with the correct one - "Mar"
//Once the 3rd array element is updated, output the 3rd array element to the console


/*class Codechef
{
	public static void main (String[] args)
	{
		String[] mnts = {"Jan", "Feb", " Dec", "Apr"};
		// update your code below this line
        System.out.println()

	}
}*/



package learning_coding;

public class Array1 {
	
	    public static void main (String[] args)
	    {
	        // your code goes here
	        String[] mnts = {"Jan", "Feb", "Dec", "Apr"};
	        mnts[2] = "Mar";
	        System.out.print(mnts[2]);
	    }
	}

