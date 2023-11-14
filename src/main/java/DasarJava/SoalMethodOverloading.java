package DasarJava;

public class SoalMethodOverloading {
    public static void main(String[] args) {
        int a = 10;
        float b = 20.0f;
        double c = 30.0;
        int d = 40;

        calculator(a, b, c, d);
    }

    //        static void calculator(double a, double b) {
//            System.out.println("a + b = " + (a+b));
//        }
    static int calculator(int param1, float param2) {
        System.out.println("param1 + param2 = " + (param1 + param2));
        return (param1 + (int) param2);
    }

    static void calculator(int bilangan1, int bilangan2, int bilangan3) {
        int tempt = calculator(bilangan1, bilangan2);
        //calculator(bilangan1, bilangan2);
        System.out.println("bilangan1 + bilangan2 + bilangan3 = " + (bilangan1 + bilangan2 + bilangan3));
    }

    static void calculator(int parameter1, float parameter2, double parameter3, int parameter4) {
        calculator(parameter1, (int) parameter2, (int) parameter3);
        System.out.println("parameter1 + parameter2 + parameter3 = " + (parameter1 + parameter2 + parameter3 + parameter4));
    }
}