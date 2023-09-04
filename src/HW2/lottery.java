package HW2;

public class lottery {
	public static void main(String[] args) {
//		阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int sum = 0;
		for (int num = 1; num <= 39; num = num + 1) {
			if (num % 10 != 4) {
				sum = sum + 1;
				System.out.print(num + " ");
			}
		}
		System.out.println();
		System.out.println("總共" + sum + "個");

	}
}
