package DasarJava;

public class Lat3Fibonacci {
    public static void main (String [] args){
        int first=0;
        int second=1;
        System.out.println("First 10 number in the fibonacci sequence:");

        for (int i = 1; i<=10; i++){
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
