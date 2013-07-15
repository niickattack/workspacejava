import java.util.Scanner;

public class testing
{   
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer ");
	    int input = in.nextInt();
	    MathUtil testi = new MathUtil();
	    System.out.print(testi.sumOfOdd(input));
	    
	    
}   
}