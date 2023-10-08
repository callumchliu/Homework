package HW9;



/**
 * 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
 * 3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
 * 大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
 * 1000元,寫一個Java程式模擬匯款10次與提款10次的情形。
 * 參考範例：TestWaitNotify.java
 */
class Account{
    private int balance=0;
    public synchronized void deposit(int bucks){
        while (balance>3000){
            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
            try{
                wait();

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        balance +=bucks;
        System.out.printf("媽媽存了%d，戶頭共有: %d\n",bucks,balance);
        notify();
    }

    public synchronized void withdraw(int bucks){
        while(balance<bucks){
            System.out.println("熊大看帳戶沒錢，暫停提款");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -=bucks;
            System.out.printf("熊大領了%d，帳戶共有%d元\n",bucks,balance);
            if (balance <= 1000) {
                System.out.println("熊大看到餘額在2000以下，要求匯款");
                notify();
            }
        }
    }

}
class Mom extends Thread{
    Account account;
    public Mom(Account account){
        this.account=account;
    }

    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            account.deposit(2000);
        }
    }
}
class Bear extends Thread{
    Account account;
    public Bear(Account account){
        this.account=account;
    }
    public void run() {
        for(int i=1; i<=10; i++){
            account.withdraw(1000);
        }
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Account acc=new Account();
        Mom mom= new Mom(acc);
        Bear bear= new Bear(acc);
        mom.start();
        bear.start();
    }
}
