package DasarJava;

public class TipeDataInterfacesCat implements TipeDataInterfacesAnimal{
    @Override
    public void makan() {
        System.out.println("Cat is eating");

    }

    @Override
    public void minum() {
        System.out.println("Cat is drinking");

    }

    @Override
    public void lari() {
        System.out.println("Cat is running");

    }

    @Override
    public void jalan() {
        System.out.println("Cat is run");

    }
}
