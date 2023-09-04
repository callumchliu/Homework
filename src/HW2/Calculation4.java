package HW2;

public class Calculation4 {
	public static void main(String[] args) {
//		請設計一隻Java程式，輸出結果為以下： 1 4 9 16 25 36 49 64 81 100
		int num = 1, square = 0;
		while (num <= 10) {
			square = num * num;
			num = num + 1;
			System.out.print(square + " ");
		}

	}
}
