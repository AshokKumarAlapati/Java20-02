 
 public class ExpTryMultiCatchTest
{ 
   public static void main(String[] ashok) 
	{
		System.out.println("inside main method");
		try
		{
			String name= null;
			System.out.println("checking the length of the name");
			name.length();
		}
		catch(NumberFormatException nfe)
		{
		  System.out.println("exception raised, please take care");
		}
		catch(NullPointerException npe)
		{
			System.out.println("NullPointerException raised");
		}
		System.out.println("after try/catch block");
	}
}






