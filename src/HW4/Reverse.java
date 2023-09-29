package HW4;

/*請建立一個字串，經過程式執行後，輸入結果是反過來的
例如String s = “Hello World”，執行結果即為dlroW olleH */


public class Reverse {
	public static void main(String[] args) {

		String n="Hello World";
		
		int leng =n.length()-1;
		for (int i=leng; i>=0 ;i-=1){
			System.out.print(n.charAt(i));
		}
		
		
//		可以直接倒過來
//		String reverseN=new StringBuilder(n).reverse().toString();
//		System.out.println(reverseN);
	}
}
