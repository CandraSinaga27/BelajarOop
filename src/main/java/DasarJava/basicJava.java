package DasarJava;

public class basicJava {
    public static void main(String[] args)
    {
        byte maxByteValue = 127;
        short maxShortValue = 32767;
        int maxIntValue = 23000000;
        float f = 3.14f;
        double d = 3.14128188;

        //byte myByte = 10;
        //short myshort = myByte;
        //int myInt = myshort;
        //long myLong = myInt;
        //System.out.println(myLong);

        double myDouble = 11.150;
        float myFloat =(float) myDouble;
        long myLong1 = (long) myFloat;
        int myInt1 = (int) myLong1;
        short myShort1 = (short) myInt1;
        byte myByte1 = (byte) myShort1;
        System.out.println(myByte1);

        char myChart = 'A';
        char myNewline = '\n';
        char copyRight = '\u00A9';
        int chartInt = myChart;
        System.out.println(myChart);
        System.out.print(myNewline);
        System.out.println(copyRight);
        System.out.print(chartInt);


    }
}