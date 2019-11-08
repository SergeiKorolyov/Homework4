public class Ball extends Figures {

    public Ball(String name, int radius) {
        super(name, radius);
        setArea(4 * Math.PI * Math.pow(radius, 2));
    }
}
