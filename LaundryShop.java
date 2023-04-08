// Laundry Shop
//  Created by Christiane A. Bacani
import java.util.Scanner;
public class LaundryShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Welcome to Bacani`s Laundry Shop!\n");
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        System.out.print("P 35 per kilo of Laundry!\n");
        System.out.print("Enter how many kilo of laundry do you have? : ");
        int kilo = input.nextInt();
        int price = 35 * kilo;
        
        System.out.print("The total price is P " + price + "\n");
        System.out.print("Enter your payment here : P ");
        int payment = input.nextInt();
        
        int change = payment - price;
        System.out.print("Change : P " + change + "\n");
        System.out.print("Press enter to exit : ");
        input.nextLine();
        String pressEnter = input.nextLine();
        
        System.out.print("\n\nTHANK YOU, PLEASE WAIT FOR 6 HOURS FOR YOUR LAUNDRY!");
 
    }
}
