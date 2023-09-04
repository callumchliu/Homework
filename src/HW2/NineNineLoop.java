package HW2;

/*
 * 巢狀迴圈應用，寫九九乘法表
 */
public class NineNineLoop {

	public static void main(String[] args) {
//		for迴圈+while迴圈

		for (int i = 1; i <= 9; i++) {
			int j = 1;
			while(j<=9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j=j+1;
			}
						
			System.out.println();
		}

//		for迴圈+do while迴圈
		for (int i = 1; i <= 9; i=i+1) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j=j+1;
			}while(j<=9);
						
			System.out.println();
		}

//		while迴圈+do while迴圈
		int i = 1;
		while (i <= 9) {
			int j = 1;
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j = j + 1;
			} while (j <= 9);
			i = i + 1;
			System.out.println();
		}

	}

}
