import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        //Scanner
        String studentName;
        int studentAge;
        Scanner hasan = new Scanner(System.in);
        System.out.println("Input Fullname : ");
        studentName = hasan.nextLine();
        System.out.println("InputAge : ");
        studentAge = hasan.nextInt();
        System.out.println("Your Fullname is" + studentName);
        System.out.println("Your Age is" + studentAge);

        System.out.println();
    }
}
