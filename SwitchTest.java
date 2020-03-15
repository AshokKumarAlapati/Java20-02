

 public class SwitchTest
{

public static void main(String[] ashok)
{

String caseName = ashok[0]; // Run :java SwitchTest aa
//String caseName = "aa";
switch(caseName)
{
	case 1: System.out.println("this is matched case of 1");
			break;
	case "cc": System.out.println("this is matched case of 2");
			break;
	case "aa": System.out.println("this is matched case of 3");
			break;
	default : System.out.println("no cases matched");
}


}

}




