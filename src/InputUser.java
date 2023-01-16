import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        //Scanner
        String studentName;
        int studentAge;
        Scanner afifah = new Scanner(System.in);
        System.out.println("Input Fullname : ");
        studentName = afifah.nextLine();
        System.out.println("InputAge : ");
        studentAge = afifah.nextInt();
        System.out.println("Your Fullname is" + studentName);
        System.out.println("Your Age is" + studentAge);

        System.out.println();
    }
}
