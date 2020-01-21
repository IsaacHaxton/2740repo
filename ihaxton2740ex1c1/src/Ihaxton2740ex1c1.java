import java.util.Scanner;

public class Ihaxton2740ex1c1 {
    public static void main(String[] args) {

        System.out.println("ihaxton2740ex1c: Renter Information\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Acct#:\t");
        int acct = sc.nextInt();

        String firstName;
        System.out.print("First name:\t");
        firstName = sc.next();

        String lastName;
        System.out.print("Last name:\t");
        lastName = sc.next();

        System.out.print("Monthly Income:\t");
        int month = sc.nextInt();

        System.out.print("Rent:\t");
        int rent = sc.nextInt();

        System.out.print("Electric:\t");
        int elect = sc.nextInt();

        System.out.print("Gas:\t");
        int gas = sc.nextInt();

        System.out.print("Cable:\t");
        int cable = sc.nextInt();
        System.out.print("\n");

        String message1 = "Account:\t" + acct + " " + firstName + " " + lastName;
        System.out.println(message1);

        String message2 = "Income - expenses:\t$" + month + " - $" + (rent + elect + gas + cable) + " = $" + (month - (rent + elect + gas + cable));
        System.out.println(message2);
     }
}
