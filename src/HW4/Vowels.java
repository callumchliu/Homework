package HW4;

//請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 


public class Vowels {
	public static void main(String[] args) {
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int sumA = 0, sumE = 0, sumI = 0, sumO = 0, sumU = 0;

		for (int i = 0; i < planets.length; i++) {
			for (int j = 0; j < planets[i].length(); j++) {
				char alphabet = planets[i].charAt(j);
				
				switch (alphabet) {
				case 'a':
					sumA = sumA + 1;
					break;
				case 'e':
					sumE = sumE + 1;
					break;
				case 'i':
					sumI = sumI + 1;
					break;
				case 'o':
					sumO = sumO + 1;
					break;
				case 'u':
					sumU = sumU + 1;
					break;
				}
			}
		}
		int grandTotal=sumA+sumE+sumI+sumO+sumU;
		System.out.printf("A有%d個、E有%d個、I有%d個、O有%d個、U有%d個、總共有%d個母音",sumA, sumE, sumI, sumO, sumU, grandTotal);
	}
}
