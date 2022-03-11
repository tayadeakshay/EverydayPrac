
public class IsFact {
	//static int fact=1;
public static void main(String[] args)
{
int i=5;
//IsFact f = new IsFact();
System.out.println(calFact(i));

}

static int calFact(int no)
{
	if(no>1)
	return (no*calFact(no-1));
	return 1;
}
}
