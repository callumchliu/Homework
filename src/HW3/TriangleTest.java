
package HW3;

import java.util.Scanner;

/*請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
三角形、其它三角形或不是三角形，如圖示結果：*/

public class TriangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入三角形邊長：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

//		System.out.println("請輸入三角形第一個邊長：");
//		int a = sc.nextInt();
//		System.out.println("請輸入三角形第二個邊長：");
//		int b = sc.nextInt();
//		System.out.println("請輸入三角形第三個邊長：");
//		int c = sc.nextInt();
		if (a * b * c == 0) {
			System.out.println("這不是三角形");
		} else if (a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("這不是三角形");
		} else if (a == b && b == c) {
			System.out.println("正三角形");
		} else if (a + b > c || b + c > a || a + c > b) {
			if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
				System.out.println("直角三角形");
			} else {
				System.out.println("其他三角形");
			}

		} else if (a == b || b == c || a == c) {

			System.out.println("等腰三角形");
		}
	}
}
