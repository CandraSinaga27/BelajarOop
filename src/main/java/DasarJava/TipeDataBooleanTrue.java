package DasarJava;

public class TipeDataBooleanTrue {
    public static void main (String [] args){
        boolean kondisi1 = true;
        boolean kondisi2 = true;
        //assert kondisi1 && kondisi2;
        boolean kondisi3 = kondisi1 && kondisi2;
        boolean kondisiNotTrue = !(kondisi1 && kondisi2);



        System.out.println(kondisi3);
        System.out.println((kondisiNotTrue));

        boolean kondisi5 = true;
        boolean kondisi6 = false;
        boolean konfisi7 = kondisi5 || kondisi6;

        System.out.println("kondisi7 adalah" + " " + konfisi7);
    }
}
