import java.util.Scanner;

public class LatihanMandiri5 {
    public static void main(String[] args) {
        //Scanner yuk bisa yuk
        Scanner afifah = new Scanner(System.in);
        int angka;
        int faktorial = 1;
        System.out.println("masukan angka");
        angka = afifah.nextInt();
        for (int x = 1; x <=angka; x++) {
            faktorial = faktorial * x;
            System.out.println("hasil faktorial adalah" + faktorial);
        }
    }
}