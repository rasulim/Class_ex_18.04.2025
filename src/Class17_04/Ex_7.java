package Class17_04;
// 7. Recursive metodla factorial hesablayan proqram
//Tapşırıq:
//Verilən ədəddən factorial hesablamaq üçün recursive metod yazın.

import java.util.Scanner;

public class Ex_7 {

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Faktorialı tapılacaq ədəd: ");
        int n = sc.nextInt();

        long cavab = factorial(n);
        System.out.println(n + "! = " + cavab);
    }
}
