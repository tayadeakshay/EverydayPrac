
public class Permutation {
public static void main(String[] args) {
	
	String s ="xyza";
	int n = s.length();
	int m = 2;
	
	int p = (factorial(n)/factorial(n-m));
	System.out.println(p);

}
	static int factorial(int n)
	{
		int fact=1;
		while(n!=0)
		{
		fact = fact*n;
		n=n-1;
		}
	return fact;	
	}
}
