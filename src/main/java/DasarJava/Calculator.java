package DasarJava;

import java.util.Scanner;

public class Calculator {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println ("Choose Your Operation:");
        System.out.println ("1. For Addition:");
        System.out.println ("2. For Subtraction:");
        System.out.println ("3. For Multiplication:");
        System.out.println ("4. For Division:");

        int choose = scan.nextInt();

        System.out.println("Enter two Number");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if(choose == 1) {
            System.out.println("The Answer is:" + add(x, y));
        }
        else if(choose == 2){
            System.out.println("The Answer is:" + add(x,y));
        }
        else if (choose == 3){
            System.out.println("The Answer is:" + add(x,y));
        }
        else if (choose == 4){
            System.out.println("The Answer is:" + add(x,y));
        }
        else{
            System.out.println("You're out of Range");
        }
    }
    public static int add(int x, int y){
        int n;
        n = x+y;
        return n;
    }
    public static int Sub(int x, int y){
        int n;
        n = x+y;
        return n;

    }
    public static int mul(int x, int y){
        int n;
        n = x*y;
        return n;

    }
    public static int div(int x, int y){
        int n;
        n = x/y;
        return n;

    }
}
