import java.util.Scanner;

public class LiveCoding1 {
    public static void main(String[] args) {
        Scanner afifah= new Scanner(System.in);
        int x;
        int y;
        int hasil;
        System.out.println("masukan angka x=");
        x= afifah.nextInt();
        System.out.println("masukan angka y=");
        y= afifah.nextInt();
        for(int i=x;i<=y;i++){
            if ((i%3==0)&&(i%7==0)) {
                System.out.println("angka:" + i);
            }else{
                System.out.println("tidak ada angka kelipatan 3 dan 7");
            }


        }

    }
}
