package DasarJava;

public class TipeDataInterfacesDog implements TipeDataInterfacesAnimal{
    @Override
    public void makan() {
        System.out.println("Dog is eating");
    }

    @Override
    public void minum() {
        System.out.println("Dog is drinking");

    }

    @Override
    public void lari() {
        System.out.println("Dog is running");

    }

    @Override
    public void jalan() {
        System.out.println("Dog is run");

    }
}
