package HW7;

import java.io.*;

/*請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料*/


//import java.io.BufferedReader;  
//import java.io.FileReader; 
public class No1 {
	public static void main(String[] args) throws Exception {
		int line = 0, word = 0;
		File input = new File("Sample.txt");
		FileInputStream fis = new FileInputStream(input);
		FileReader f1 = new FileReader(input);
		FileReader f2 = new FileReader(input);	
		BufferedReader br = new BufferedReader(f2);
		String str;
//		一次讀一行
		while ((str = br.readLine()) != null) {
			if (str.length() != 0) {
				line = line + 1;
			}
		}
//		一次讀一個字
		while ((f1.read()) != -1) {
			word =word+ 1;
		}
		System.out.println(line+"行");
		System.out.println(input.length()+"個位元組");
		System.out.println(word+"個字");
		
		br.close();
		f1.close();
		fis.close();
	}
}
