public abstract class Figures {

    private String name;
    private int perimeter;
    private double area;
    private int lengthOfSide;
    private int lengthOfSecondSide;
    private double radius;

    public Figures(String name, int lengthOfSide) {
        this.name = name;
        this.lengthOfSide = lengthOfSide;
    }

    public int getLengthOfSide() {
        return lengthOfSide;
    }

    public void setLengthOfSide(int lengthOfSide) {
        this.lengthOfSide = lengthOfSide;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerimeter(int perimeter) {
        this.perimeter = perimeter;
    }

    public int getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getLengthOfSecondSide() {
        return lengthOfSecondSide;
    }

    public void setLengthOfSecondSide(int lengthOfSecondSide) {
        this.lengthOfSecondSide = lengthOfSecondSide;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("Name: %s Perimeter: %d Area: %f", getName(), getPerimeter(), getArea());
    }
}
