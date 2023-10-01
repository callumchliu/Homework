package HW8;

import java.util.Objects;
import java.util.*;

class Train implements Comparable <Train> {
	private int number;
	private String type, start, dest;
	private double price;

	public Train(int number, String type, String start, String dest, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.dest = dest;
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public String getType() {
		return type;
	}

	public String getStart() {
		return start;
	}

	public String getDest() {
		return dest;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime=31;
		int result=17;
		result=(int) (result*prime+number+price);
		result=result*prime+dest.hashCode();
		result=prime*result+start.hashCode();
		result=prime*result+type.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj != null && getClass() == obj.getClass()) {
			Train train = (Train) obj;

			if (this.number == train.number && this.type == train.type && this.start == train.start
					&& this.dest == train.dest && this.price == train.price)
				return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return String.format("車次：%d，車種：%s，由%s開往%s，票價為%s", number, type, start, dest, price);
//		return "車次："+number+"車種："+type+start+"往"+dest+"票價："+price;
	}

	public int compareTo(Train t) {
		if (number > t.number) {
			return 1;
		} else if (number == t.number) {
			return 0;
		} else {
			return -1;
		}
	}

}

public class HW8_2 {
	public static void main(String[] args) {
//		 請寫一隻程式，能印出不重複的Train物件
		Set<Train> hs = new HashSet<Train>();
		hs.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		hs.add(new Train(1254, "區間", "屏東", "基隆", 700));
		hs.add(new Train(118, "自強", "高雄", "台北", 500));
		hs.add(new Train(1288, "區間", "新竹", "基隆", 400));
		hs.add(new Train(122, "自強", "台中", "花蓮", 600));
		hs.add(new Train(1222, "區間", "樹林", "七堵", 300));
		hs.add(new Train(1254, "區間", "屏東", "基隆", 700));
//	Iterator objs=hs.iterator();
//	while(objs.hasNext()) {
//		System.out.println(objs.next());
//	}
//		for (Train t : hs) {
//			System.out.println(t);
//		}
		
//		請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		List<Train> lt= new ArrayList<Train>();
		lt.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		lt.add(new Train(1254, "區間", "屏東", "基隆", 700));
		lt.add(new Train(118, "自強", "高雄", "台北", 500));
		lt.add(new Train(1288, "區間", "新竹", "基隆", 400));
		lt.add(new Train(122, "自強", "台中", "花蓮", 600));
		lt.add(new Train(1222, "區間", "樹林", "七堵", 300));
		lt.add(new Train(1254, "區間", "屏東", "基隆", 700));
		Collections.sort(lt);
//		for (int i=0; i<lt.size();i++) {
//			Object o1=lt.get(i);
//			System.out.println(o1);
//		}
//		for(Train t1:lt) {
//			System.out.println(t1);
//		}
//		Iterator i1=lt.iterator();
//		while(i1.hasNext()) {
//			Object o1=i1.next();
//			System.out.println(o1);
//		}
		
//		 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		Set<Train> ts = new TreeSet<Train>();
		ts.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		ts.add(new Train(1254, "區間", "屏東", "基隆", 700));
		ts.add(new Train(118, "自強", "高雄", "台北", 500));
		ts.add(new Train(1288, "區間", "新竹", "基隆", 400));
		ts.add(new Train(122, "自強", "台中", "花蓮", 600));
		ts.add(new Train(1222, "區間", "樹林", "七堵", 300));
		ts.add(new Train(1254, "區間", "屏東", "基隆", 700));
//		for(Train t2:ts) {
//			System.out.println(t2);
//		}
		Iterator i2=ts.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
	}

}


