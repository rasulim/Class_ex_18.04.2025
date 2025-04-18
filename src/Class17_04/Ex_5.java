package Class17_04;
// 5. Comparable ilə obyektləri sıralamaq
//Tapşırıq:
//Employee adlı sinif yaradın.
// Comparable interfeysindən istifadə edərək əməkdaşları yaşa görə sıralayan proqram yazın.

import java.util.ArrayList;
import java.util.Collections;

public class Ex_5 {
    public static void main(String[] args) {
        ArrayList<Employee> siyahi = new ArrayList<>();

        siyahi.add(new Employee("Ayxan", 55));
        siyahi.add(new Employee("Rəsul", 33));
        siyahi.add(new Employee("Zəminə", 20));
        siyahi.add(new Employee("Elnarə", 25));

        System.out.println("Sıralanmamış siyahı:");
        for (Employee e : siyahi) {
            System.out.println(e);
        }

        Collections.sort(siyahi);

        System.out.println("\nYaşa görə sıralanmış siyahı:");
        for (Employee e : siyahi) {
            System.out.println(e);
        }
    }
}
