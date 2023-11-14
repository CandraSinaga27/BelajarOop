package DasarJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SintaxPerulangan {
    public static void main(String[] args) { //method main
        int [] myArray = new int[100];
        for (int i=0; i<100; i++){
            if (i == 0){
                myArray[i] = 10;
            } else {
                myArray[i] = myArray[i-1] + 10;
            }
            //int temp = myArray[i];

        }
        System.out.println(Arrays.toString(myArray));

        for (int i=0; i<100; i++){
            System.out.println("perulangan ke-" + myArray[i]);

        }
    }
}