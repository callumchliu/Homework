package HW4;

/* 有個一維陣列如下：
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素*/


public class ArrayAverage {
	public static void main(String[] args) {
		
		int [] array1= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
		   sum += array1[i];
		}
		double average=sum/array1.length;
		System.out.println("此陣列的平均數是"+ average);
		for (int i=0; i<array1.length; i++) {
			if(array1[i]>average) {
				System.out.print(array1[i]+"\t");
			}
		}
		
		
	}
}
