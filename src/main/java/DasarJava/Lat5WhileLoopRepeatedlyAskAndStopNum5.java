package DasarJava;

import java.util.Scanner;

public class Lat5WhileLoopRepeatedlyAskAndStopNum5 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);//System.in -> menerima input tipe dari data scanner
        int UserInput;
        while (true){
            System.out.println("Enter a Number");
            UserInput = scanner.nextInt();

            if (UserInput ==5){
                System.out.println("You Entered 5. Existing The Loop" );
                break;
            }else {
                System.out.println("your entered number is:" + UserInput);
            }
        }
    }
}
