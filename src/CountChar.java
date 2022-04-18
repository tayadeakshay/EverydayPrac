import java.util.Arrays;

public class CountChar {

	public static void main(String[] args) {

		String s = "akshaytayade";
		
		char[] c = s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<c.length;i++)
		{
			int count =1;
			for(int j=i+1;j<c.length-1;j++)
			{
				if(c[i] == c[j])
					count++;
			}
			for(int k=i-1;k>=0;k--)
			{
				if(i>0)
				{
					if(c[i]==c[k])
						count=0;
				}
			}
			if(count>0)
			{
			System.out.printf("%s's count is %d",c[i],count);
			System.out.println();
			}
		}
	}

}
