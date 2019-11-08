import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        Figures figure = new Figures("Figure", 4);


        Figures square = new Square("Square", 3);
        System.out.println(square);

        Figures rectangle = new Rectangle("Rectangle", 3, 5);
        System.out.println(rectangle);

        Figures circle = new Circle("Circle", 4);
        System.out.println(circle);

        Figures ball = new Ball("Ball", 5);
        System.out.println(ball);

        List<Figures> list = new ArrayList<>();
        Picture picture = new Picture(list);
        picture.setList(list);
        list.add(0, square);
        list.add(1, rectangle);
        list.add(2, circle);
        list.add(3, ball);
        System.out.println(picture.getList());


    }
}
