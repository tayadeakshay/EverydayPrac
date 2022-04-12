
public class CheckPower {

	public static void main(String[] args) {

System.out.println(IsPower(3,2));
	}

	public static int IsPower(int a ,int b)
	{
		int multi = 1;
		for(int i=1;i<=b;i++)
		{
			multi *=a;
		}
		return multi;
	}
}
