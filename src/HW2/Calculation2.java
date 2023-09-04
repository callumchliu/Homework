package HW2;

public class Calculation2 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int product = 1;
		for (int num = 1; num <= 10; num = num + 1) {
			product = product * num;
		}
		System.out.println(product);

	}
}
