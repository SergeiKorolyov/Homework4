public class Spher extends Figures {

    public Spher(String name, int radius) {
        super(name, radius);
        setArea(4 * Math.PI * Math.pow(radius, 2));
    }
}
