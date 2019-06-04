import java.util.Scanner;

public class QuizFiveSix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name :");
		String result=studying(sc.next());
		System.out.println(result);
		
		
	}
	
	public static String studying(String name)
	{
		
		return name+" is studying";
	}

}
