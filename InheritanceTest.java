
class Parent{
	
	void parentShow(){
		System.out.println("thisis parent show");
	}
	}
 public class InheritanceTest extends Parent
{
	void childShow(){
		System.out.println("thisis child show");
	}
   
   public static void main(String[] ashok)
	{
		
		Parent inheritanceTest = new InheritanceTest();
		inheritanceTest.childShow();
		inheritanceTest.parentShow();
		
	}
}






