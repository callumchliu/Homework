package HW5;
//抽象父類別
abstract class Pen {
	private String brand;
	private double price;
	
	public Pen() {};
	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public abstract void write();
}

class Pencil extends Pen {
	public Pencil() {};
	public Pencil(String brand, double price) {
		super(brand, price);
	}
	@Override
	public double getPrice() {
		return super.getPrice()*0.8;
	}
	public void write() {
		System.out.println("削鉛筆再寫");
	}
}

class InkBrush extends Pen {
	public InkBrush() {
	}
	public InkBrush(String brand, double price) {
		super(brand, price);
	}
	@Override
	public double getPrice() {
		return super.getPrice()*0.9;
	}
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}

public class TestPen {
	public static void main(String[] args) {
		Pen[] pens =new Pen[2];
		pens[0] =new Pencil("Mitsubishi", 20);
		pens[1] =new InkBrush("LION", 150);
		for (int i=0; i<pens.length; i++) {
			pens[i].write();
			System.out.println("價格為"+pens[i].getPrice());
		}
	}
}