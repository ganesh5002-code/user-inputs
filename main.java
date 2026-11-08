import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a string ");
        String str = scn.nextLine();
        System.out.println("The string is: " + str);
        
        System.out.print("Enter a integer: ");
        String num = scn.nextLine();
        System.out.println("The integer is: " + num);
        
        System.out.print("Enter a decimal number ");
        String fl = scn.nextLine();
        System.out.println("The decimal number is: " + fl);

        scn.close();


    }
}