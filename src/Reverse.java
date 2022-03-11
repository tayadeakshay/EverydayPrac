
public class Reverse {

	public static void main(String[] args) {
		String a="Akshay",rev="";
		int length=a.length();
		while(length!=0){
			rev=rev+a.charAt(length-1);
		length =length-1;
		}
	System.out.println(rev);	
	}

}
