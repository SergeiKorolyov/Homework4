public class Square extends Figures {


    public Square(String name, int lengthOfSide) {
        super(name, lengthOfSide);
        setPerimeter(getLengthOfSide() * 4);
        setArea(Math.pow(getLengthOfSide(), 2.0));
    }


}
