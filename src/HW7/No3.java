package HW7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class No3 {

	public void CopyFile(File input, File output) {
		try {
			FileReader in = new FileReader(input);
			FileWriter out = new FileWriter(output);
			int i;
			while ((i = in.read()) != -1) {
				out.write(i);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
