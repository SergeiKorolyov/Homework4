public class Rectangle extends Figures {

    public Rectangle(String name, int lengthOfSide, int lengthOfSecondSide) {
        super(name, lengthOfSide);
        setPerimeter((getLengthOfSide() + getLengthOfSecondSide()) * 2);
        setArea(lengthOfSide * lengthOfSecondSide);

    }
}
