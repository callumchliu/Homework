package HW4;
import java.util.Arrays;
public class HighestScore1 {
	public static void main(String[] args) {
		int[][] scores = { {10, 35, 40, 100, 90, 85, 75, 70}, {37, 75, 77, 89, 64, 75, 70, 95},
						   {100, 70, 79, 90, 75, 70, 79, 90}, {77, 95, 70, 89, 60, 75, 85, 89},
				           {98, 70, 89, 90, 75, 90, 89, 90},  {90, 80, 100, 75, 50, 20, 99, 75} };
//		陣列：每個學生最高分的次數
		int[] count = new int[8];
//		複製六次一維陣列，並找出最高分
		for (int i = 0; i < scores.length; i++) {
			int[] each_time =Arrays.copyOf(scores[i], scores[i].length);
			Arrays.sort(each_time);
			int highest =each_time[7]; //排序後最高的在index[7]
//			比對scores中每一個小陣列，找出最高分數所在位置的index
			for (int j = 0; j < scores[i].length; j++) {
				if (highest ==scores[i][j]) {
//					計算每一個號碼得到最高分的次數
					count[j] =count[j]+1;
					break;
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println((i + 1)+"號同學有"+ count[i]+"次最高分");
		}
	}
}
