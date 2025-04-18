import java.util.HashMap;
//2. HashMap ilə təkrarlanan simvolları saymaq
//Tapşırıq:
//Verilmiş stringdəki hər bir simvolun neçə dəfə təkrarlandığını göstərən proqram yazın.

public class Ex_2 {
    public static void main(String[] args) {
        String metn = "Hi my name is Rasul";

        simvolTəkrarSay(metn);
    }

    public static void simvolTəkrarSay(String metn) {
        HashMap<Character, Integer> sayMap = new HashMap<>();

        for (char c : metn.toCharArray()) {
            if (sayMap.containsKey(c)) {
                sayMap.put(c, sayMap.get(c) + 1);
            } else {
                sayMap.put(c, 1);
            }
        }

        for (char c : sayMap.keySet()) {
            System.out.println("'" + c + "' simvolu " + sayMap.get(c) + " dəfə təkrar olunub.");
        }
    }
}