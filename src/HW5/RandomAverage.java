package HW5;

//請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class RandomAverage {
	public static void main(String[] args) {
		RandomAverage avg= new RandomAverage();
		avg.randAvg();
	}
	
	private void randAvg() {
		int[] j=new int [10];
		int sum=0;
		System.out.println("本次亂數結果：");
		for (int i=0; i<10; i++) {
			j[i]=(int)(Math.random()*100);
			System.out.print(j[i]+" ");
			
		}
		System.out.println();
		for (int k=0; k<10; k++) {
			sum=sum+j[k];
		}
		int average= sum/10;
		System.out.println(average);
		
	}
	
}
