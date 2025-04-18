package Class17_04;
public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount, String threadName) {
        System.out.println(threadName + " yoxlayır: balans = " + balance);

        if (balance >= amount) {
            System.out.println(threadName + " çıxarır: " + amount);
            balance -= amount;
            System.out.println(threadName + " üçün qalan balans: " + balance + "\n");
        } else {
            System.out.println(threadName + ": kifayət qədər balans yoxdur! Mövcud = " + balance + "\n");
        }
    }
}
