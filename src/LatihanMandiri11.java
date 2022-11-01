import java.util.Scanner;

public class LatihanMandiri11 {
    public static void perkalian(int a, int b){
        int hasil_perkalian= a*b;
        System.out.println(hasil_perkalian);

    }

    public static void main(String[] args) {
        //perkalian (a:10, b:12)
        //perkalian (a: 4, b:5)
        Scanner afifah= new Scanner(System.in);
        int perkalian= afifah.nextInt();
        System.out.println(" masukan angka 1=");
        int angka1= afifah.nextInt();
        System.out.println("masukan angka 2");
        int angka2= afifah.nextInt();
        perkalian(angka1,angka2);
    }
}
