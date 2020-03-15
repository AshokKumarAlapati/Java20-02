

 public class ConstructorTest
{
	int studentId;
	String studentName;
	ConstructorTest()
	{
		System.out.println("this is default or no-arguement constructor");
	}
	ConstructorTest(int id, String name)
	{
		this.studentId = id;
		this.studentName = name;
		System.out.println("this is 1- paramter constructor");
	}
   
   public static void main(String[] ashok)
	{
		ConstructorTest student0 = new ConstructorTest();
		ConstructorTest student1 = new ConstructorTest(101,"ashok");
		ConstructorTest student2 = new ConstructorTest(102,"teja");
		System.out.println("the id of 1st student is :"+ student1.studentId );
		System.out.println("the name of 1st student is :"+student1.studentName);
		System.out.println("************************");
		System.out.println("the id of 2nd student is :"+ student2.studentId );
		System.out.println("the name of 2nd student is :"+student2.studentName);
		
		
	}
}




