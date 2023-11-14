package OOP;

public class Child extends Parent {
    Integer uang;

    Child(int uang1, String rumah1, String mobil1){
        super(uang1, rumah1,mobil1);
    }

    @Override
    public void bagiWarisan(){
        System.out.println("aku mau semua warisan");
    }

    public int getUang(){
        return super.uang;
    }



//    public void cekHasilWarisan(){
//        bagiWarisan();
//        super.bagiWarisan();
//
//
//    public static void main(String[] args){
//        sayHello();
//    }
}
