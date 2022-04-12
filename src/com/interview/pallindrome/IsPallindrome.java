package com.interview.pallindrome;

public class IsPallindrome {

	public static int pallindrome(int a) {
		int temp = a, res = 0, rem, sum;

		while (a != 0) {
			rem = a % 10;
			res = res * 10 + rem;
			a = a / 10;
		}
		System.out.println("Reverse:---------   " + res);
		sum = res + temp;
		System.out.println("Addition:--------   " + sum);

		int temp1 = sum, res1 = 0, rem1, sumNew;

		while (sum != 0) {
			rem1 = sum % 10;
			res1 = res1 * 10 + rem1;
			sum = sum / 10;
		}
		System.out.println("Addition reverse:-  " + res1);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		if (res1 == temp1)
			return res1;
		else
			return pallindrome(res1);
	}

}