import java.util.Scanner;

public class MenghitungLintasanBola {
    public static void main(String[] args) {
        //Scanner
        Scanner afifah = new Scanner(System.in);
        double r, sTotal, sTurun, a;
        double sNaik;
        String nama;
        System.out.println("Menghitung Lintasan Bola Dari Awal Sampai Berhenti");
        System.out.println("Masukan Nama Anda : ");
        nama = afifah.nextLine();
        System.out.println("Masukan Ketinggian Bola : ");
        a = afifah.nextDouble();
        System.out.println("Masukan Coef r : ");
        r = afifah.nextDouble();
        sNaik = a / (1-r);
        System.out.println("S naik dari sebuah bola : " + sNaik);
        sTurun = (a*r)/(1-r);
        System.out.println("S turun dari sebuah bola :" + sTurun);
        sTotal = sNaik + sTurun;
        System.out.println(" Panjang Lintasan Dari Awal Sampai Akhir" + sTotal);
    }
}
