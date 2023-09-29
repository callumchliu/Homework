package HW3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//輸入不要的數字後，直接亂數印出6個號碼且不得重複

public class ArwinSixNumbers {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("阿文請輸入你討厭的數字：");
//
		int n = sc.nextInt();

		Set<Integer> set = new HashSet<Integer>();

		while (set.size() < 6) {
			int num = (int) (Math.random() * 49 + 1);
			if (num != n && num % 10 != n && num / 10 != n) {
				set.add(num);
			}
		}
		
		Iterator objs = set.iterator();
		while (objs.hasNext())
			System.out.println(objs.next());
	}
	
	
//		int[] number = new int[6];
//
//		for (int i = 0; i < number.length; i++) {
//			int chosen = (int) ((Math.random() * 49) + 1);
////			System.out.println(chosen);
//			if (chosen != a && chosen % 10 != a && chosen / 10 != a) {
//				number[i] = chosen;
//			} else {
//				i=i-1;  //如果不符合i就-1、重選數字
//			}
//			for (int j = 0; j < i; j++) {
//				if (number[i] == number[j]) {
//					i=i-1;
//					break;
//				}
//
//			}
//		}
//		System.out.println("所選的號碼是：");
//		for (int k = 0; k < number.length; k++) {
//			System.out.print(number[k] + "\t");
//		}

}
