package Class17_04;
// 6. Lambda ifadələri və Stream API ilə filtr
//Tapşırıq:
//List<Integer> verilmişdir.
// Bu siyahıdan yalnız 10-dan böyük və cüt ədədləri seçərək yeni siyahı qaytaran kod yazın.

import java.util.*;
        import java.util.stream.Collectors;

public class Ex_6 {
    public static void main(String[] args) {
//        List<Integer> ededler = Arrays.asList(5, 12, 8, 20, 3, 18, 11, 30, 9);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ədədləri boşluqla daxil et: ");
        List<Integer> ededler = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> netice = ededler.stream()
                .filter(eded -> eded > 10 && eded % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("10-dan böyük və cüt ədədlər: " + netice);
    }
}