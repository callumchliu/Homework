package HW2;

public class pyramid2 {
	public static void main(String[] args) {
		/*
		 * 請設計一隻Java程式，輸出結果為以下： A 
		 * 									  BB
											  CCC
											  DDDD
											  EEEEE
											  FFFFFF
		 */

//           A-F Unicode十進位：65~70
		for (int i = 1, a = 65; i <= 6; i = i + 1, a = a + 1) {
			for (int j = 1; j <= i; j = j + 1) {
				char realA = (char) a;
				System.out.print(realA);

			}
			System.out.println();
		}

	}
}