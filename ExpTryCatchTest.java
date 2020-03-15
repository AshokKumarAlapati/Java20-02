
import java.io.*;
 public class ExpTryCatchTest
{
	
   
   public static void main(String[] ashok) 
	{
		System.out.println("inside main method");
		try
		{
			System.out.println("ready to start read the data from file");
			FileReader f = new FileReader("c:\\abc.txt");
		}
		catch(FileNotFoundException exp)
		{
		  System.out.println("exception raised, please take care");
		}
		System.out.println("after try/catch block");
	}
}






