package solid.isp;

public class Dog implements BarkingAnimal{

    @Override
    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
