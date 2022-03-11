
public class FirstDuplicate {

	public static void main(String[] args) {

		int[] a = {5,4,7,3,8,3,9,5};
		
		check:
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						System.out.println("The first duplicate no is "+a[i]);
					break check;
					}
				}
			}
			
	}

}
