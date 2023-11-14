package DasarJava;

import java.util.Scanner;

public class Lat7whileLoopWithUserInput {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int temp = 10;


        while (myScanner.hasNext()) {
            System.out.println("Enter a Number");
            int userInput = myScanner.nextInt();
            //temp = myScanner.nextInt();

            if (userInput > temp) {
                System.out.println("Angka yang kamu masukan lebih besar yaitu:" + " " + userInput);
            } else if (userInput < temp) {
                System.out.println("yang kamu masukan lebih kecil yaitu:" + " " + userInput);
            } else {
                System.out.println("Angka yang kamu masukan sama yaitu" + " " + userInput);
                break;
            }
        }
    }
}
