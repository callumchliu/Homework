package HW7;
import java.io.*;
//import java.util.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/*請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
append功能讓每次執行結果都能被保存起來)*/

public class No2 {
	public static void main(String[] args) throws Exception {
		int[] array = new int[10];
		FileOutputStream fos = new FileOutputStream("data.txt", true);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		PrintStream ps= new PrintStream(bos);
		for(int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 1000 + 1);
			ps.println(array[i]);
		}
		ps.close();
		bos.close();
		fos.close();
		
	}
}
