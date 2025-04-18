package Class17_04;
import java.util.ArrayList;
// 1. ArrayList-də ən uzun stringi tapın
//Tapşırıq:
//Verilmiş ArrayList<String> içində ən uzun stringi tapıb ekrana çap edən metodu yazın.

public class Ex_1 {
    public static void main(String[] args) {

        ArrayList<String> sozler = new ArrayList<>();
        sozler.add("alma");
        sozler.add("armud");
        sozler.add("banan");
        sozler.add("nar");
        sozler.add("qarpız");

        tapEnUzunSoz(sozler);
    }
    public static void tapEnUzunSoz(ArrayList<String> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("Siyahı boşdur.");
            return;
        }
        String enUzun = list.get(0);
        for (String soz : list) {
            if (soz.length() > enUzun.length()) {
                enUzun = soz;
            }
        }
        System.out.println("Ən uzun söz: " + enUzun);
    }
}
