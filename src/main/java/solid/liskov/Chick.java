package solid.liskov;

public class Chick implements  Bird{
    @Override
    public String tweet() {
        return "PIO-PIO";
    }
}
