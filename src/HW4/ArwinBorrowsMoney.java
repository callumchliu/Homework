package HW4;
import java.util.Scanner;
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
