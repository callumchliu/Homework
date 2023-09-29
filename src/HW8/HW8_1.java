package HW8;

import java.util.*;
import java.math.BigInteger;

/*印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
• 移除不是java.lang.Number相關的物件
• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功*/

public class HW8_1 {
	public static void main(String[] args) {
		ArrayList arrlist= new ArrayList();
		arrlist.add(new Integer(100));
		arrlist.add(new Double (3.14));
		arrlist.add(new Long (21L));
		arrlist.add(new Short("100"));
		arrlist.add(new Double (5.1));
		arrlist.add("Kitty");
		arrlist.add(new Integer(100));
		arrlist.add(new Object());
		arrlist.add("Snoopy");
		arrlist.add(new BigInteger("1000"));
		
		Iterator objs=arrlist.iterator();
		
		while(objs.hasNext()) {
			System.out.println(objs.next());
		}
//		
		for(int i=0; i<arrlist.size();i++) {
			Object obj=arrlist.get(i);
			System.out.println(obj);
		}
		for(Object o: arrlist) {
			System.out.println(o.toString());
		}
		
//		System.out.println("-----------------");
		Iterator obj1= arrlist.iterator();
		while(obj1.hasNext()) {
			if(!(obj1.next() instanceof Number)){
				obj1.remove();
			}
		}
		for(Object a:arrlist){
			System.out.println(a);
		}
		
	}
}
