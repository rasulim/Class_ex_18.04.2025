package Class17_04;
// 8. TreeMap ilə obyektlərin sıralanması
//Tapşırıq:
//TreeMap<Integer, String> istifadə edərək açarları artan sırayla saxlayan proqram yazın. Map-i ekrana çap edin.

import java.util.Map;
import java.util.TreeMap;

public class Ex_8 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Alma");
        map.put(1, "Armud");
        map.put(4, "Banan");
        map.put(2, "Ərik");

        System.out.println("TreeMap - açarları artan sırada:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Açar: " + entry.getKey() + " → Dəyər: " + entry.getValue());
        }
    }
}