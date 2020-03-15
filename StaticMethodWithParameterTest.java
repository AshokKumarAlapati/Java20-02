

 public class StaticMethodWithParameterTest
{

public static void main(String[] ashok)
{
	System.out.println("this is  main method");
	   int inputt;
	   System.out.println("the input is");
	   int money=takeRupee(10);
	   
System.out.println("the money from takeRupee method is : "+money);

}

static int  takeRupee(int rupee){
	int b=10;
  System.out.println("this is static takeRupee method"+b);
  return rupee;
}


}




