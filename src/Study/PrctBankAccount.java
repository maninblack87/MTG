package Study;
import java.util.*;

public class PrctBankAccount {
    int balance = 0;
    String account;

    Scanner sc = new Scanner(System.in);

    public PrctBankAccount(){
        System.out.print("본인의 이름을 입력하시오.");
        account = sc.next();
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        if(balance < amount)
            System.out.println("잔액이 부족합니다.");
        else
            balance -= amount;
    }

    public void toMessage(){
        System.out.printf("%s님의 잔액은 %d원 입니다.", account, balance);
    }

    public static void main(String[] args) {
        PrctBankAccount myAccount = new PrctBankAccount();
        myAccount.deposit(10000);
        myAccount.withdraw(8000);
        myAccount.toMessage();
    }
}
