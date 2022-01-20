package com.in28minutes.JspidersQuestion;

public class RecursionPractice {

	int number;
	static int base1 = 0;
	static int base2 = 1;
	static int reverse = 0;

	public RecursionPractice(int number) {
		this.number = number;
	}

	public int findFactorial(int number) {
		if (number == 1) {
			return 1;
		}
		return number * findFactorial(number - 1);
	}

	public int findFibonacciNumber(int number) {
		int sum = 0;
		sum = base1 + base2;
		base1 = base2;
		base2 = sum;
		if (number == 3) {
			return sum;
		}
		else if (number == 1) {
			return 0;
		} else if (number == 2) {
			return 1;
		}
		return findFibonacciNumber(number - 1);
}

public void findFibonacciSeries(int number) {
	int sum = 0;
	sum = base1 + base2;
	base1 = base2;
	base2 = sum;
	System.out.print(sum + " ");
	if (number > 0) {
		findFibonacciSeries(number - 1);
	}
}

		public boolean findPalindromOrNot(int number) {
			int check = number;
			if (number > 10) {
				int digit = number % 10;
				reverse = reverse * 10 + digit;
				if (reverse == check) {
					return true;
				}
				return findPalindromOrNot(number / 10);
			}
			return false;
		}
}