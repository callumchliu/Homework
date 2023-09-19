package HW3;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int i=(int)(Math.random()*9);
		Scanner sc = new Scanner(System.in);
//		System.out.println("開始猜數字囉");
//		int n = sc.nextInt();
//		System.out.println(i);
//		if(i==n) {
//			System.out.println("答對了！答案就是"+ i);
//		}
//		else {
//			while (true) {
//				System.out.println("猜錯囉");				
//				int a = sc.nextInt();
//				if (a==i) {
//					break;					
//				}
//			}
//			System.out.println("答對了！答案就是"+ i);
//		}
//		
// 		進階挑戰
		
		int guess;
		int random = (int)(Math.random() * 100);
		int max = 100, min = 0;
			System.out.println("開始猜數字囉");
		while(true) {
			
			guess = sc.nextInt();
		
			if(guess == random) {
				System.out.println("答對了！答案就是" + guess);
				break;
			} else if(guess < random && min<guess) {
				min=guess;
				System.out.printf("比%d大\n", guess);
				System.out.println(guess + "到" + max);
				
			} else if(guess > random && max>guess) {
				max=guess;
				System.out.printf("比%d小\n", guess);
				System.out.println(min + "到" + guess);
				
			}
		}
		
		
		
		
	}
}
