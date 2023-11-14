package DasarJava;

public class Lat6LoopWithArrayPrintLargestElement {
    public static void main (String [] args){
        int [] myArray = {10,12,32,55,14,16,17,87,34,16,19,34,57,76,22,27,83};
        int temp = 0; //nampung sementara nilai terbesar

        for (int i=0; i < myArray.length; i++){
            if (myArray[i] > temp){
                temp=myArray[i];
            }
        }
        System.out.println("Teh Largest element in the array is: " + temp);
    }
}
