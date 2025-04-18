package Class17_04;
// 9. Thread Pool istifadə edərək çoxsaylı vəzifələrin icrası
//Tapşırıq:
//ExecutorService istifadə edərək 5 fərqli vəzifəni (Runnable) icra edən proqram yazın.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex_9 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int id = i;
            Runnable task = () -> {
                System.out.println("Vəzifə " + id + " başladı - " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Vəzifə " + id + " bitdi - " + Thread.currentThread().getName());
            };

            executor.execute(task);
        }

        executor.shutdown();
    }
}