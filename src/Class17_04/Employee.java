package Class17_04;

public class Employee implements Comparable<Employee> {
    private String ad;
    private int yas;

    public Employee(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

    public String getAd() {
        return ad;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.yas, other.yas);
    }

    @Override
    public String toString() {
        return ad + " - Yaş: " + yas;
    }
}