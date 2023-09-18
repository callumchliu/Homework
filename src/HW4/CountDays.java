package HW4;

import java.util.Scanner;

public class CountDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期（yyyy mm dd）：");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		CountDays CD = new CountDays();
//		CD.testing(month, day);

		CD.daycount(year, month, day);
		sc.close();
	}

//	public void testing(int month, int day) {
//		int[] dayinMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		int index=month-1;
//		if (month>12 || day>dayinMonth[index]) {
//			System.out.println("輸入錯誤，請重新輸入");
//			
//		}
//		
//	}
//非閏年二月的問題待解決
	public void daycount(int year, int month, int day) {
		int[] dayinMonth = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		//// 4的倍數但不是100的倍數，可是400的倍數是
		int index = month - 1;
		if (month > 12 || day > dayinMonth[index]) {
			System.out.println("輸入錯誤，請重新輸入");
		} else {
			if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
				dayinMonth[1] = 29;
			} else {
				dayinMonth[1] = 28;
			}

			int totalday = 0;
			if (month > 12) {

			}
			if (index == 0) {
				totalday = day;
			} else {
				for (int i = 0; i < index; i++) {
					totalday = totalday + dayinMonth[i];
				}
				totalday = totalday + day;
			}
			System.out.printf("西元%d年，第%d天", year, totalday);

		}
	}
}
