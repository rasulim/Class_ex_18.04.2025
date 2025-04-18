package Class17_04;
// 4. Multithreading ilə sadə bank sistemi
//Tapşırıq:
//İki thread eyni BankAccount obyektindən pul çıxmağa çalışır.
// synchronized istifadə edərək problemi həll edin.
//
//Create a BankAccount class with synchronized withdraw method
//Create two threads that try to withdraw money from the same account
public class Ex_4 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account, 70, "Thread-1");
        WithdrawThread t2 = new WithdrawThread(account, 50, "Thread-2");

        t1.start();
        t2.start();
    }
}

