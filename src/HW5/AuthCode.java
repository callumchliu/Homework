package HW5;

import java.util.Random;

/*身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
與數字的亂數組合 */

public class AuthCode {
	public static void main(String[] args) {
		AuthCode ac = new AuthCode();
//		AuthCode ac1= new AuthCode();
//		ac1.genAuthCode();
		

		

	}

//	Using ASCII

	public void genAuthCode() {
		int[] code = new int[8];
		int n;
		System.out.println("本次隨機產生驗證碼為：");
		for (int i=0; i<code.length; i++) {
			while (true) {
//				ASCII 48-57數字、65-90英文大寫、97-122英文小寫
				n =(int)(Math.random()*75) + 48;
				if ((48<=n && n<=57) || (65<=n && n<=90) || (97<=n && n<=122)) {
					code[i] =n;
					System.out.print((char)code[i]);
					break;
				}
			}
		}
	}

//	type all alphabets (both lower & upper) and numbers
	public AuthCode() {
		String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		Random rd = new Random();
		char[] code = new char[8];
		for (int i = 0; i < code.length; i++) {
			char letter = random.charAt(rd.nextInt(random.length()));
			code[i] = letter;
		}
		System.out.println("本次隨機產生驗證碼為：");
		for (int j = 0; j < code.length; j++) {
			System.out.print(code[j]);
		}
	}
}
