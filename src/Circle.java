public class Circle extends Figures {

    public Circle(String name, int radius) {
        super(name, radius);
        setPerimeter((int) (2 * Math.PI * radius));
        setArea(Math.PI * Math.pow(radius, 2));
    }
}
