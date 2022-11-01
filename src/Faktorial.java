import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner afifah= new Scanner(System.in);
        int angka;
        int Faktorial= 1;
        System.out.println("masukan input:");
        angka = afifah.nextInt();
        for (int u=1;u<=angka;u++) {
            Faktorial = Faktorial * u;
        }
            System.out.println("hasil faktorial:"+Faktorial);
        }
    }
