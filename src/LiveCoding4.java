import java.util.Scanner;

public class LiveCoding4 {
    public static void main(String[] args) {
        Scanner afifah= new Scanner(System.in);
        String[]belanjaan=new String[10];
        for(int x=0;x< belanjaan.length;x++){
            System.out.println("masukan belanjaan :");
            belanjaan[x]= afifah.nextLine();
        }
    }
}
