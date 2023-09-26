package HW6;

public class Calculator {
	public static int powerXY(int x, int y) throws CalException {
		if (x != 0 && y >= 0) {
			return (int) Math.pow(x, y);
		}else if (y<0) {
			throw new CalException("次方為負值，結果回傳不為整數");
		}
		else {
			throw new CalException("0的0次方沒有意義");
		}
	}
}
