package DasarJava;

public class TipeDataReference {
    public static void main (String []args){
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2);

        String str3 = new String("Hello"); //new String -> class string
        System.out.println(str1 == str3);
    }

}
