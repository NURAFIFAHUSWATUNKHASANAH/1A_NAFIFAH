import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {

        Scanner afifah = new Scanner(System.in);
        System.out.println("Input Passwoard :");
        String passwoard = afifah.nextLine();
        if (passwoard.equals("abcdef")) {
            System.out.println("Passwoard benar");
        }else{
            System.out.println("Passwoard salah");
        }
    }
}