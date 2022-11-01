import java.util.Scanner;

public class LatihanMandiri10 {
    public static void main(String[] args) {
        Scanner afifah= new Scanner(System.in);
        String[]nama=new String[6];
        for (int x=0;x< nama.length;x++){
            System.out.println("masukan nama"+x+":");
            nama[x]=afifah.nextLine();
        }
        System.out.println("---------------------");
        for (String y:nama){
            if ((y.contains("a"))||(y.contains("i"))){
                System.out.println(y+ " ada a atau tidak i");
            }else{
                System.out.println(y+ " tidak ada a atau i ");
            }
        }
        }
    }

