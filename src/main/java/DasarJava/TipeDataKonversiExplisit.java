package DasarJava;

public class TipeDataKonversiExplisit {
    public static void main (String[] args){
        float DataFloat = 1000000000;
        long DataLong = (long) DataFloat;
        int DataInt = (int) DataLong;
        short DataShort = (short) DataInt;

        System.out.println(DataFloat);
        System.out.println(DataLong);
        System.out.println(DataInt);

    }
}
