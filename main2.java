import java.util.Scanner;

class main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number");
        int num = scn.nextInt();
        
        if (num>20){
            System.out.println(num + " is greater than 20.");
        } else {
            System.out.println(num + " isn't greater than 20.");
        }

        scn.close();

    }
        
    }
