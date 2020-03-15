class Student
{
	int studentId;
	String studentName;
	String studentAddress;
	Student()
	{
		System.out.println("this is default or no-arguement constructor");
	}
	Student(int studentId, String studentName, String studentAddress)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		System.out.println("this is 3- paramter constructor");
	}
}

 public class ConstructorTest1
{
	
   
   public static void main(String[] ashok)
	{
		
		Student student1 = new Student(101,"ashok","kvz");
		Student student2 = new Student(102,"teja","nlr");
		System.out.println("the id of 1st student is :"+ student1.studentId );
		System.out.println("the name of 1st student is :"+student1.studentName);
		System.out.println("the address of 1st student is :"+student1.studentAddress);
		System.out.println("************************");
		System.out.println("the id of 2nd student is :"+ student2.studentId );
		System.out.println("the name of 2nd student is :"+student2.studentName);
		System.out.println("the address of 2nd student is :"+student2.studentAddress);
		
		
	}
}






