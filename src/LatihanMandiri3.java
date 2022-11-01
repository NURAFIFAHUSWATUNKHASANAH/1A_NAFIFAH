import java.util.Scanner;

public class LatihanMandiri3 {
    public static void main(String[] args) {
        //Menghitung faktorial
        Scanner afifah = new Scanner(System.in);
        int angka;
        int faktorial = 1;
        System.out.println("masukan input");
        angka = afifah.nextInt();
        for (int x = 1; x <= angka; x++) {
            faktorial = faktorial * x;
            System.out.println("Hasil faktorial" + faktorial);
        }
    }
}
