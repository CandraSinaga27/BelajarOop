package DasarJava;

public class Operasimatematika {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int c = a + b;
        int d = b-a;
        int e = a*b;
        int f = b/a;
        int g = b%a;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        System.out.println("===================");
        Integer z = 0;

        z = a + 10; //0 +10
        z = a +10; //10 + 10;dst
        z +=10;
        z +=30;

        a++;
        a++;
        a++;
        a--;

        System.out.println("--------------");

        int o= 100;
        int p= 100;

        boolean q = o ==p;
        boolean r = o <p;
        boolean s = o >p;
        boolean t = o <=p;
        boolean u = o >=p;
        boolean v = o !=p;
        System.out.println(v);

        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
        int nilaiUntukLulus = 75;
        int nilaiAkhirSiswa = 60;
        int nilaiPraktikumSiswa= 75;

        boolean cekNilaiAkhir = nilaiAkhirSiswa >=nilaiUntukLulus;
        boolean nilaiAkhirPratikum = nilaiPraktikumSiswa >=nilaiUntukLulus;

        boolean apakahlulus = cekNilaiAkhir || nilaiAkhirPratikum;

        System.out.println("Apakah lulus" + " " + apakahlulus);

        apakahlulus = cekNilaiAkhir && nilaiAkhirPratikum;
        System.out.println("Apakah Lulus" + " " + apakahlulus);

        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");

        String nilai = "A";
        String lulusNgaaYa;
        switch (nilai){
            case "A":
                System.out.println("Nilai Anda A");
                break;
            case "B":
                System.out.println("Nilai Anda B");
                break;
            case "C":
                System.out.println("Nilai Anda C");
                break;
            default: //else
                System.out.println("Nilai Akhir Anda Tidak Diketahui");
                break;



        }

        if (nilai == "A") {
            lulusNgaaYa = "LULUS";
        } else {
            lulusNgaaYa = "NGGA";
        }
        System.out.println(lulusNgaaYa);
        lulusNgaaYa = nilai == "A"? "LULUS" : "NGGA";

        System.out.println("ooooooooooooooo");


    }
}
