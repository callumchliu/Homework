package HW7;
import java.io.*;
//import java.util.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

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
