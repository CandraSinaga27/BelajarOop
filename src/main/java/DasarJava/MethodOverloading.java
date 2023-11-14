package DasarJava;

public class MethodOverloading {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        calculator(a, b, c);
    }

    static void calculator(double a, double b) {
        System.out.println("a + b = " + (a+b));
    }
    static void calculator(int param1, int param2) {
        System.out.println("param1 + param2 = " + (param1+param2));
    }

    static void calculator(int bilangan1, double bilangan2, int bilangan3) {
        calculator(bilangan1, (int) bilangan2);
        double bilangan4 = bilangan2;
        System.out.println("bilangan1 + bilangan2 + bilangan3 = " + (bilangan1+bilangan2+bilangan3));
    }

    static void calculator(int param1, int param2, int param3, int param4) {
        int newTemp = param1+param2+param3+param4;
        System.out.println("param1 + param2 + param3 + param4 = " + newTemp);
    }
}