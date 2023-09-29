package HW6;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		try{
			System.out.println("請輸入x的值：");
			int x =sc.nextInt();
			System.out.println("請輸入y的值：");
			int y=sc.nextInt();

				System.out.println(x+"的"+y+"次方為"+Calculator.powerXY(x,y));

			
		}catch(CalException e){
			e.printStackTrace();
		}catch(InputMismatchException ime){
			System.out.println("輸入格式不正確");
			
		}

		
	}
}
