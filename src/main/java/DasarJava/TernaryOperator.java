package DasarJava;

public class TernaryOperator {
    public static void main(String[] args) {
        var Nilai = 75;
        String ucapan;

        if (Nilai>=75){
            ucapan = "Selamat Anda Lulus";
        } else {
            ucapan = "Anda Belom Lulus";
        }

        // DasarJava.TernaryOperator
        var Nilai1 = 80;
        String ucapan1 = Nilai1>=90 ? "Selamat Anda Lulus yahh" : "Anda belom Lulus lohh";
        System.out.println(ucapan);
        System.out.println(ucapan1);
    }
}
