package HW2;

public class Calculation1 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int num = 1, sum = 0;
		while (num <= 1000) {
			if (num % 2 == 0) {
				sum = sum + num;
			}
			num = num + 1;
		}
		System.out.println(sum);
	}
}
