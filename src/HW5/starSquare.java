package HW5;

/*請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
圖：*/

import java.util.Scanner;
public class starSquare {
	public static void main(String[] args) {
		starSquare s= new starSquare();
		s.starSquare();
	}
	
	public void starSquare () {
		Scanner sc= new Scanner (System.in);
		System.out.println("請輸入寬與高：");
		int width= sc.nextInt();
		int height= sc.nextInt();
		for(int i=0; i<height; i++) {
			for (int j=0; j<width; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
