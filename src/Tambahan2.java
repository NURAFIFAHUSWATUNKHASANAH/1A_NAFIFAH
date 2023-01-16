import java.util.Scanner;

public class Tambahan2 {
    public static void main(String[] args) {
        Scanner afifah= new Scanner(System.in);
        int panjang;
        int lebar;
        int Luas;

        System.out.println("panjangnya adalah");
        panjang= afifah.nextInt();
        System.out.println("lebar adalah");
        lebar= afifah.nextInt();
        Luas=panjang*lebar;
        System.out.println("Luasnya"+Luas);

    }
}
