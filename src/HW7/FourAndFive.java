package HW7;

/*請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
型簡化本題的程式設計)*/

import java.io.Serializable;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class FourAndFive {
	public static void main(String[] args) throws Exception {
		Animal[] a =new Animal[4];
		a[0] =new Dog("Apple the Schnauzer");
		a[1] =new Cat("Lumi");
		a[2] =new Dog("Lulu");
		a[3] =new Cat("Bobo");

//		https://stackoverflow.com/questions/2833853/create-whole-path-automatically-when-writing-to-a-new-file/2833883#2833883
//		若資料夾不存在則自動創建
		File file =new File("C:\\data\\Object.ser");
		file.getParentFile().mkdirs();

		// 輸出
		FileOutputStream fos =new FileOutputStream(file);
		ObjectOutputStream oos =new ObjectOutputStream(fos);
//		for (int i = 0; i < a.length; i++) {
//			oos.writeObject(a[i]);
//		}
		for (Animal a1: a) {
			oos.writeObject(a1);
		}
		
		oos.close();
		fos.close();

//		讀取Object.ser物件，並執行speak()方法
		FileInputStream fis =new FileInputStream(file);
		ObjectInputStream ois =new ObjectInputStream(fis);
				
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("======== 資料讀取完畢！========");
		}
		ois.close();
		fis.close();
	}
}

class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;

	public Animal(String name) {
		this.setName(name);
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void speak() {
	}
}

class Dog extends Animal {
	private static final long serialVersionUID = 1L;
	private String name;

	public Dog(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Cat extends Animal {
	private static final long serialVersionUID = 1L;
	private String name;

	public Cat(String name) {
		super(name);
	}

	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}

	public void setName(String name) {
		this.name = name;
	}
}
