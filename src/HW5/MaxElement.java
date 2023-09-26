package HW5;

public class MaxElement {
	public static void main(String[] args) {
		MaxElement maxi= new MaxElement();
		int[][] intArray= {{1, 6, 3}, {9, 5, 2}};
		double [] [] douArray= {{3.6, 7.09, 3.11}, {9.44, 90.22, 26.55}};
		System.out.println(maxi.maxElement(intArray));
		System.out.println(maxi.maxElement(douArray));
	}
	
	
	
//	Can also use for-each loop: for (type variableName : arrayName)
//	Two-Dim Array: https://stackoverflow.com/questions/29588837/what-does-forint-i-x-do
	public int maxElement(int x[][]) {
		int max=0;
		for (int []i : x) {
			for (int j: i) {
				if (max<j) {
					max=j;
				}
			}
		}
//		for (int i=0; i<x.length; i++) {
//			for (int j=0; j<x[i].length;j++) {
//				if (max<x[i][j]) {
//					max=x[i][j];
//				}
//			}
//		}
		return max;
	}
	
	public double maxElement(double x[][]) {
		double max=0;
		for (int i=0; i<x.length; i++) {
			for (int j=0; j<x[i].length;j++) {
				if (max<x[i][j]) {
					max=x[i][j];
				}
			}
		}
		return max;
	}
}
