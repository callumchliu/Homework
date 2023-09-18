package HW3;

import java.util.Scanner;

public class ArwinHatesNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("阿文請輸入你討厭的數字：");
		int n = sc.nextInt();
		if (n >= 10 || n <= 1) {
			System.out.println();
		}
		for (int num = 1; num <= 49; num = num + 1) {
			if (num != n && num % 10 != n && num / 10 != n) {
				System.out.print(num + "\t");
				count = count + 1;
				if (count % 6 == 0) {
					System.out.println();
				}
			}

		}
		System.out.println("總共" + count + "個數字可以選");

	}
}
