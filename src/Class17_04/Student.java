package Class17_04;

import java.io.Serializable;

public class Student implements Serializable {
    private String ad;
    private int yas;

    public Student(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ad: " + ad + ", Yaş: " + yas;
    }
}
