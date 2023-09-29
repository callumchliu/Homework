package HW4;
import java.util.Scanner;

/*請設計一個程式,可以讓阿文輸入欲借的金額後,便會顯示哪些員工編號的同事
有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
員工編號: 25 19 27 共 3 人!」*/

public class ArwinBorrowsMoney {
	public static void main(String[] args) {
		int money [][]= {{25, 2500}, {32, 800}, {8, 500}, {19, 1000}, {27, 1200}};
		Scanner sc = new Scanner(System.in);
		System.out.println("你要借多少錢？");
		int need= sc.nextInt();
		int howmany=0;
		System.out.print("有錢可借的員工編號:");
		for(int i=0; i<money.length; i++) {
			if (need< money[i][1]) {
				System.out.print(money[i][0]+" ");
				howmany=howmany+1;
			}
		}
		System.out.println("共"+howmany+"人！");
	}
}
