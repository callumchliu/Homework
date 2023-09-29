package HW3;

import java.util.Scanner;


/*阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
的號碼與總數*/

public class ArwinHatesNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("阿文請輸入你討厭的數字：");
		int n = sc.nextInt();
		if (n >= 10 || n <= 1) {
			System.out.println();
		}
		for (int num = 1; num <= 49; num = num + 1) {
			if (num != n && num % 10 != n && num / 10 != n) {
				System.out.print(num + "\t");
				count = count + 1;
				if (count % 6 == 0) {
					System.out.println();
				}
			}

		}
		System.out.println("總共" + count + "個數字可以選");

	}
}
