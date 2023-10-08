package HW9;
/*
*開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的競賽過程。
*每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
*Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
*參考範例：CounterRunnable.java
* */

class Mantou implements Runnable{
    public Mantou() {
    }

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            int seconds=(int)(Math.random()*2500+500);
//            System.out.println(seconds);
            try {
                System.out.printf("饅頭人吃第%d碗飯\n",i);
                Thread.sleep(seconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("饅頭人吃完了！");

    }
}

class James implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            int seconds=(int)(Math.random()*2500+500);
//            System.out.println(seconds);
            try {
                System.out.printf("詹姆士吃第%d碗飯\n",i);
                Thread.sleep(seconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("詹姆士吃完了！");
    }
}


public class CompetitiveEating {
    public static void main(String[] args) {
        System.out.println("-----大胃王快食比賽開始----");
        James james= new James();
        Mantou mantou= new Mantou();
        Thread t1=new Thread(james);
        Thread t2= new Thread(mantou);
        t1.start();
        t2.start();


        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("---大胃王快食比賽結束！---");
    }
}
