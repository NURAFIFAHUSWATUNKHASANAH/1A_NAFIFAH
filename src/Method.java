import java.net.PortUnreachableException;

public class Method {
    public static void Penjumlahan(){
        int angka1=3;
        int angka2=4;
        int hasil= angka1*angka2;
    }
    public static void Perkalian(){
        int angka3=5;
        int angka4=8;
        int hasil= angka3*angka4;
    }
    public static void CetakHarder(String header){
        System.out.println(header);
    }
    public static void CetakFooter(String footer){
        System.out.println(footer);
        System.out.println("---------------------");
    }
    public static void GanjilGenap(int number1, int number2){
        int AfterCalculate= number1*number2;
        if(AfterCalculate%2==0){
            System.out.println(AfterCalculate+" Adalah Genap  ");
        }else{
            System.out.println(AfterCalculate+ "Adalah Ganjil ");
        }
    }
    public static void main(String[]args){
        Penjumlahan();
        Perkalian();
        CetakHarder("Ini adakah Harder untuk Ganjil Genap");
        GanjilGenap(5,9);
        CetakFooter("Ini adalah akhir Ganjil Genap");
    }
}
