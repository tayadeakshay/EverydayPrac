import java.util.Scanner;

public class StringIssue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		Double d = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		
		
		sc.close();
		
		System.out.println("String: "+s);
		System.out.println("Double:"+ d);
		System.out.println("Int:"+ i);
	}

}
