import java.util.Scanner;

public class Exercise01A {
    public static void main(String[] args) {
        //Scanner
        Scanner afifah = new Scanner(System.in);
        double x;
        double r;
        double s,sTotal,sTurun,sNaik;
        String nama;
        System.out.println("Menghitung Lintasan Bola Dari Awal Sampai Berhenti");
        System.out.println("Masukan Nama Anda : ");
        nama = afifah.nextLine();
        System.out.println("Masukan Ketinggian Bola : ");
        x = afifah.nextDouble();
        System.out.println("Masukan Coef r : ");
        r = afifah.nextDouble();
        s =  x/ (1-r);
        System.out.println("S naik dari sebuah bola : " + s );

        }
    }

