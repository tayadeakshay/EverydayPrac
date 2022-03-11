
enum Month {

	JAN(10), FEB(20), MAR(30), APR(40), MAY, JUN(50);

	int price;

	Month(int price) {
		this.price = price;
		System.out.println("Contstructor arg");
	}

	private Month() {
		System.out.println("cons noarg");
this.price=60;
	}

	public int getprice()
	{
		return price;
	}
}

public class IsEnum {
	public static void main(String[] args) {

//		Month a = Month.JAN;
//		System.out.println("Hello");
//
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		 Month[] m = Month.values();
//	
//	for(Month m1:m)
//		System.out.println(m1+" "+m1.ordinal());
		for(Month m2:m) {
			System.out.println(m2+" "+m2.getprice());
	}}
}