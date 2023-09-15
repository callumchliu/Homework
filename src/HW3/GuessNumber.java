package HW3;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int i=(int)(Math.random()*9);
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字囉");
		int n = sc.nextInt();
//		System.out.println(i);
		if(i==n) {
			System.out.println("答對了！答案就是"+ i);
		}
		else {
			while (true) {
				System.out.println("猜錯囉");				
				int a = sc.nextInt();
				if (a==i) {
					break;					
				}
			}
			System.out.println("答對了！答案就是"+ i);
		}
	}
}
