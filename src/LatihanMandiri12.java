import java.util.Scanner;

public class LatihanMandiri12 {
    public static void nama_mantan(String mantan1, String mantan2) {
       String nama_mantan= mantan1+mantan2;
        System.out.println(mantan1);
    }

    public static void main(String[] args) {
        //nama mantan 1= AZA
        //nama mantan 2= ARA
        Scanner afifah= new Scanner(System.in);
        System.out.println(" nama mantan 1= ");
        String nama_mantan1= afifah.nextLine();
        System.out.println(" nama mantan 2= ");
        String nama_mantan2= afifah.nextLine();
    }
    }
