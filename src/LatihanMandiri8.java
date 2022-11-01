import java.util.Scanner;

public class LatihanMandiri8 {
    public static void main(String[] args) {
        Scanner afifah= new Scanner(System.in);
        int angka;
        int hasil;
        System.out.println("Input angka");
        angka= afifah.nextInt();
        for(int x=1;x<=angka;x++);
        hasil= angka*angka;
        System.out.println("hasilnya adalah"+ hasil);
    }
}
