

 public class StaticMethodTest1
{

public static void main(String[] ashok)
{
	System.out.println("this is  main method");
	String name = giveString();
	System.out.println("the name is "+name);
}

static String giveString(){
  System.out.println("this is static giveString method");
  return "Yes Sir";
}


}




