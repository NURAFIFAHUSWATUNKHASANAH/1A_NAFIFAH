import java.util.Scanner;

public class LiveCoding2 {
    public static void main(String[] args) {
        int[]angka= new int[3];//3 cell- indexnya mulai dari 0 sampai 2
        String[] nama= new String[4];//4 cell -indexnya mulai 0 sampai 3

        //masukan value ke daalam array angka
        angka[0]=2;
        angka[3]=4;
        //mengambil value dari array angka
        int s=angka[2];
        //masukan value dari array string nama
        nama[2]="budi";
        nama[3]="dika";
        //mengambil value dari array String nama
        String u= nama[2];
        String t= nama[3];
        ///deklarasi array dengan cara lain
        int[] number={1,45,7,34,89,12};//ada 6 cell- integer
        for (int index=0;index<number.length;index++){
            System.out.println("angka dalam array number="+number[index]);
        }

    }
}
