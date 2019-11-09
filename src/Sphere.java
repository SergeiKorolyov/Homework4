public class Sphere extends Figures {

    public Sphere(String name, int radius) {
        super(name, radius);
        setArea(4 * Math.PI * Math.pow(radius, 2));
    }
}
