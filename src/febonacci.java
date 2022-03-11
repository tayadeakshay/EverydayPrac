
public class febonacci {
static int a=0,b=1,c;
	public static void main(String[] args)
{
	int a=0,b=1,c,count=0,n;
	n=10;
System.out.print("0,1,");
febo(n);
}

static void febo(int n)
{
	//int a=0,b=1,c;
if(n!=0)
{
c=a+b;
a=b;
b=c;
System.out.print(c+",");
febo(n-1);

}

}
}
