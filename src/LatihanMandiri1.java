import java.util.Scanner;

public class LatihanMandiri1 {
    public static void main(String[] args) {
        Scanner afifah= new Scanner(System.in);
        System.out.println("input nama");
        String nama= afifah.nextLine();
        if (nama.equals("Nur Afifah Uswatun Khasanah")) {
            System.out.println("nama Benar");
        }else {
            System.out.println("nama Salah");
        }
    }
}
