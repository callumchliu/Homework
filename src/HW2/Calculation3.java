package HW2;

public class Calculation3 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int product = 1, num = 1;
		while (num <= 10) {
			product = product * num;
			num = num + 1;
		}

		System.out.println(product);

	}
}
