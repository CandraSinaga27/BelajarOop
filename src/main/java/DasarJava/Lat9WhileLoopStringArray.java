package DasarJava;

import java.util.Scanner;

public class Lat9WhileLoopStringArray {
    public static void main (String [] args){
        String YourPin = "1234";
        int MaximumAttempts = 3;
        int Attempts=0;

        Scanner myScanner = new Scanner(System.in);

        while (Attempts < MaximumAttempts) {
            System.out.println("Masukan PIN dengan Benar");
            String EnterPin = myScanner.nextLine();

            if (EnterPin.equals(YourPin)){
                System.out.println("PIN Benar. Welcome to ATM!!");
                break;
            }else {
                Attempts++;
                int RemainingAttempts = MaximumAttempts - Attempts;
                System.out.println("Pin Salah, Kesempatan Anda tinggal - " + RemainingAttempts + "x lagi");
            }
    }
    }
}
