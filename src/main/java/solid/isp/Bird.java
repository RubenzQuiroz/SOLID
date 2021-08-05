package solid.isp;

public class Bird implements FlyingAnimal{
    @Override
    public void run() {
        System.out.print("Bird is running");
    }

    @Override
    public void fly() {
        System.out.print("Bird is flying");
    }
}
