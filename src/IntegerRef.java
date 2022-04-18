
public class IntegerRef {

	public static void main(String[] args) {

		Integer i1 = 100;
		Integer i2 = 100;
		System.out.println(i1 == i2);

		Integer i3 = 200;
		Integer i4 = 200;
		System.out.println(i3 == i4);

		int i5 = 100;
		int i6 = 100;
		System.out.println(i5 == i6);

		int i7 = 200;
		int i8 = 200;
		System.out.println(i7 == i8);

		Integer i9 = new Integer(100);
		Integer i10 = new Integer(100);
		System.out.println(i9 == i10);

	}
}