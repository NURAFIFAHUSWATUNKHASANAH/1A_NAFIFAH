import java.util.Scanner;

public class DariPadaGabut {
    public static void main(String[] args) {
        //Scanner
        Scanner afifah = new Scanner(System.in);
        int angka1;
        int hasil;
        System.out.println("masukan angka");
        angka1 = afifah.nextInt();
        hasil= angka1*angka1;
        if (hasil>= 10 && hasil<= 30){
            System.out.println("Hasilnya : "+ hasil);
        }

    }
}
