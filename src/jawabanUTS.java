import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class jawabanUTS {

    int jumlahLantaiParkir = 3;
    static int totalKendaraan = 450; //150mobil x 3 lantai= 450 mobil
    public static String[] ParkirLantai1 = new String[149];
    public static String[] ParkirLantai2 = new  String[149];
    public static String[] ParkirLantai3 = new String[149];

    public static int[] TotalBobotParkirLantai1 = {450000};
    public static int[] TotalBobotParkirLantai2 = {200000};
    public static int[] TotalBobotParkirLantai3 = {150000};

    public static void PrintInfokendaraan(){
        int totalParkirLantai1 = 0;
        int totalSisaKuota =0;
        for (int index=0; index< ParkirLantai1.length; index++){
            if (ParkirLantai1[index] != null){
                totalParkirLantai1++;
            }
        }
        int totalParkirLantai2=0;
        for (int index = 0; index< ParkirLantai2.length;index++){
            if (ParkirLantai2[index] != null){
                totalParkirLantai2++;
            }
        }
        int totalParkirLantai3 = 0;
        for (int index = 0;index< ParkirLantai3.length;index++){
            if (ParkirLantai3[index] != null) {
                totalParkirLantai3++;
            }
        }
        totalSisaKuota = totalKendaraan - totalParkirLantai1 - totalParkirLantai2 - totalParkirLantai3;
        System.out.println("Total Kendaraan lantai 1 : " + totalParkirLantai1 + " | total Kendaraan Lantai 2 : " + totalParkirLantai2 + " | total Kendaraan Lantai 3 : "+ totalParkirLantai3);
        System.out.println("jumlah kapasitas : " + totalKendaraan + " | total Kendaraan : " + totalSisaKuota);
        System.out.println("-----------------------------------------------------");

    }
    public static void  ChekIndexArray(String[] myArray,String kendaraan){
        int indexNow = 0;
        for (int index =0 ; index< myArray.length;index++){
            if (myArray[index] != null){
                indexNow= index+1;
            }
        }
        if (indexNow< myArray.length){
            myArray[indexNow] = kendaraan;
        }
    }
    public static void simpanKendaraan (int angkaRandom, String kendaraan){
        switch (angkaRandom){
            case 1:
                ChekIndexArray(ParkirLantai1,kendaraan);
                System.out.println("anda parkir di lantai 1");
                PrintInfokendaraan();
                break;
            case 2:
                ChekIndexArray(ParkirLantai2,kendaraan);
                System.out.println("anda parkir di lantai 2");
                PrintInfokendaraan();
                break;
            case 3:
                ChekIndexArray(ParkirLantai3,kendaraan);
                System.out.println("anda parkir di lantai 3");
                PrintInfokendaraan();
                break;
        }
    }
    public static void inputKendaraan(){
        Scanner inputData = new Scanner(System.in);
        while (true){
            System.out.print("Masukan Plat Nomer Kendaraan = ");
            String platNomor = inputData.nextLine();
            if (platNomor.isBlank()) {
                System.out.println("Plat nomor wajib diisi ");
                inputKendaraan();
            }else{
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3)+1;
                simpanKendaraan(JenisRandom,platNomor);
            }
        }
    }

    public static void main(String[] args) {
        inputKendaraan();
    }
}


