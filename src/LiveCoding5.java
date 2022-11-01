import java.util.Scanner;

public class LiveCoding5 {
    //METHOD
    public static void penjumlahan(int x, int y){
        int hasil_penjumlah= x+y;
        System.out.println(hasil_penjumlah);
    }
    public static void main(String[] args) {
        //penjumlahan(x:3 y:4);
        //penjumlahan(x:6, y:10);
        //penjumlahan(x:10, y:1000);
        Scanner inputData= new Scanner(System.in);
        System.out.println("masukan angka 1=");
        int angka1= inputData.nextInt();
        System.out.println("masukan angka2=");
        int angka2= inputData.nextInt();
        penjumlahan(angka1,angka2);
    }
}
