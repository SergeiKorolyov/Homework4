public class Main {



    public static void main(String[] args) {

        Figures square = new Square("Square", 3);
        System.out.println(square);

        Figures rectangle = new Rectangle("Rectangle", 3, 5);
        System.out.println(rectangle);

        Figures circle = new Circle("Circle", 4);
        System.out.println(circle);

        Figures sphere = new Sphere("Sphere", 5);
        System.out.println(sphere);

        Figures circle1 = new Circle("Circle", 6);

        Picture picture = new Picture();
        picture.addFigures(square);
        picture.addFigures(rectangle);
        picture.addFigures(circle);
        picture.addFigures(sphere);
        picture.addFigures(circle1);

        System.out.println(picture.perimeterOfAllFigures());

        System.out.println(picture.areaOfAllFigures());

        System.out.println(picture.namesOfAllFigures());

        System.out.println(picture.mapOfFigures());

    }
}
