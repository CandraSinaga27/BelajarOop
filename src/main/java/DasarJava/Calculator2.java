package DasarJava;

import java.util.Scanner;

public class Calculator2 {
    public static void main (String [] args) {

        int a, b, hasil;
        char operator;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextInt();
        System.out.print("Operator=");
        operator = inputUser.next().charAt(0);
        System.out.println("nilai b = ");
        b = inputUser.nextInt();
        System.out.print("nilai b=");
        b = inputUser.nextInt();

        System.out.println("input user: " + a + " " + operator + " " + b);

        if (operator == '+') {
            //penjumlahan
            hasil = Calculator.add(a,b);
            System.out.println("hasil:" + hasil);
        } else if (operator == '-') {
            //pengurangan
            hasil = a - b;
            System.out.println("hasil:" + hasil);
        } else if (operator == '*') {
            //perkalian
            hasil = a * b;
            System.out.println("hasil:" + hasil);
        } else if (operator == '/') {
            // pembagian
            if (b == 0) {
                System.out.println("pembagi nol menhasilkan nilai tak terhingga");
            } else {
                hasil = a / b;
                System.out.println("hasil:" + hasil);
            }
        }else {
            //operator tidak ditemukan
            hasil = a + b;
            System.out.println("Operator Tidak Ditemukan");
        }
    }

}
