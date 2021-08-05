package solid.liskov;

public class Hen implements  Bird{
    @Override
    public String tweet() throws Exception {
        throw  new Exception("las gallinas gorjean");
    }

    public String warble() throws Exception {
        return "kokoroko kokoroko";
    }
}
