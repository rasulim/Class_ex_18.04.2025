package Class17_04;
//3. Serializable istifadə edərək obyektləri fayla yazmaq
//Tapşırıq:
//Student adlı sinif yaradın və bu sinfi fayla yazmaq üçün Serializable interfeysindən istifadə edin.
// Sonra fayldan oxuyun.

import java.io.*;

public class Ex_3 {
    public static void main(String[] args) {

        Student telebe = new Student("Rasul", 33);

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(telebe);
            out.close();
            fileOut.close();
            System.out.println("Tələbə fayla yazıldı.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student oxunanTelebe = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Fayldan oxunan tələbə: " + oxunanTelebe);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
