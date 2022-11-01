import java.util.Scanner;

public class LatihanMandiri9 {
    public static void main(String[] args) {
        Scanner afifah = new Scanner(System.in);
        String[] nama = new String[3];
        for (int x = 0; x < nama.length; x++) {
            System.out.println("masukan nama");
            nama[x] = afifah.nextLine();
        }
        for (String y : nama) {
            if ((y.contains("u")) || (y.contains("a"))) {
                System.out.println(y + " ada huruf u atau a ");
            } else {
                System.out.println(y + " tidak ada huruf u atau a ");
            }
        }
    }
}
