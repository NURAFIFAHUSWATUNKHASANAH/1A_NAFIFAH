import java.util.Scanner;

public class LiveCoding3 {
    public static void main(String[] args) {
        Scanner afifah = new Scanner(System.in);
        String[] belanjaansaya = new String[2];
        for (int x = 0; x <= belanjaansaya.length; x++) {
            System.out.println(" Masukan nama belanjaan :");
            belanjaansaya[x] = afifah.nextLine();
        }
        int j = 0;
        do {
            System.out.println("masukan nama barang:");
            belanjaansaya[j] = afifah.nextLine();
            j++;
        } while (j < belanjaansaya.length);
        }
    }
