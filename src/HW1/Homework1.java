package HW1;

public class Homework1 {
	public static void main(String[] args) {
//		請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a=12, b=6;
		System.out.println("12+6=" + (a+b));
		System.out.println("12*6=" + (a*b));
		
//		請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		int dozens=200/12, eggs=200%12;
		System.out.println("總共"+ dozens +"打又"+ eggs+"顆");
		
//		請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int secstobecount=256559, hrs=24, mins=60, secs=60;
		int days=256559/(hrs*mins*secs);//總共幾天
		System.out.println(days);
		int secleftdays=256559%(hrs*mins*secs);//天算完了剩幾秒
		int hours=secleftdays/(mins*secs);//幾小時
		int seclefthours=secleftdays%(mins*secs);//小時算完還幾秒
		int minutes=seclefthours/secs;//幾分鐘
		int seconds=minutes%secs;
		System.out.println("256559秒為"+ days +"天"+ hours +"小時"+ minutes +"分"+seconds+"秒");
	
//	    請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double pi=3.1415, radius=5;
		System.out.println("圓面積為"+ (radius*radius*pi)+"，圓周長為"+ (2*radius*pi));
	
//		某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本金加利息共有多少錢(用複利計算，公式請自行google)
		int savings=150;
		System.out.println("共有"+ savings*Math.pow(1.02, 10) +"萬元");
		
//		請寫一隻程式，利用System.out.println()印出以下三個運算式結果： 5 + 5 5 +‘5’ 5 + “5” 並請用註解各別說明答案的產生原因
		System.out.println(5+5);
//		整數5+5進行之數學運算，故答案為10
		System.out.println(5+'5');
//		int數值5+char型的5，char5在Unicode十六進位值是0x35，即十進位53，並以十進位之單位做運算故53+5=58
		System.out.println(5+"5");
//		int型數值5+String字串的5，在此+代表字串串接，結果為String型之55
	}

}
