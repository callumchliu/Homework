package HW3;

import java.util.Scanner;

public class ArwinSixNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文請輸入你討厭的數字：");

		int a = sc.nextInt();

		int[] number = new int[6];

		for (int i = 0; i < number.length; i++) {
			int chosen = (int) ((Math.random() * 49) + 1);
//			System.out.println(chosen);
			if (chosen != a && chosen % 10 != a && chosen / 10 != a) {
				number[i] = chosen;
			} else {
				i=i-1;  //如果不符合i就-1、重選數字
			}
			for (int j = 0; j < i; j++) {
				if (number[i] == number[j]) {
					i=i-1;
					break;
				}

			}
		}
		System.out.println("所選的號碼是：");
		for (int k = 0; k < number.length; k++) {
			System.out.print(number[k] + "\t");
		}

	}
}