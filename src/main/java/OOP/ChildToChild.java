package OOP;

public class ChildToChild extends Child {
    Integer uang;
    ChildToChild(int uang1, String rumah1, String mobil1){
        super(uang1, rumah1,mobil1);
    }

    public void hitungUang(){
        System.out.println(uang);
        System.out.println(super.uang);
        System.out.println(getUang());
    }
}
