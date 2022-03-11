import java.util.Scanner;

public class ArmstrongNO {

	public static int isCount(int a)
	{int rem,count=0;
	while(a!=0){
		rem=a%10;
		count++;
		a=a/10;
	}
	return count;
	}
	public static void isArmstrong(int a) {
		int count,arm=0,rem,temp=a;
		count=isCount(a);
		while(a!=0) {
			int multi=1;
			rem=a%10;
			a=a/10;
		for(int i=1;i<=count;i++)
		{
			multi=multi*rem;
		}
		arm=arm+multi;
		}
		if(arm==temp)
			System.out.println("Its armstrong");
		else
			System.out.println("Its not armstrong");

	}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter no to check weather it is armstrong or not");
int a = sc.nextInt();
	isArmstrong(a);
}
}
