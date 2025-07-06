/* Write a java programme to take an integer number at runtime by using command line argument and check given number is +ve or -ve.  */

class Test
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);

		if(num>0)
		{
			System.out.println("Given number i.e "+num+"is positive");
		}
		else
		{
			System.out.println("Given number i.e "+num+" is negative");	
		}
		
	}
}