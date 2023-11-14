package OOP;

public class Parent {
    int uang;
    String rumah;
    String mobil;

    Parent(int uang1, String rumah1, String mobil1){
        this.uang=uang1;
        this.rumah=rumah1;
        this.mobil=mobil1;
    }

    public static void sayHello(){
        System.out.println("Hi, i'm your Parent");
    }
    public  void bagiWarisan(){
        System.out.println("Selamat Anda untung");
    }
}
