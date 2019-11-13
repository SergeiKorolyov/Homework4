import java.lang.reflect.Array;
import java.util.*;

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

        Array[][] field = new Array[10][10];
        SeaBattleField newField = new SeaBattleField(field);

        Mathematics mathematics = new Mathematics();

        Map a = new HashMap();
        Map b = new HashMap();
        a.put("First", 4);
        b.put("Second", 4);

        System.out.println(mathematics.sum(a, b));


    }
}
