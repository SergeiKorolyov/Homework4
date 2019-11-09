import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Picture {
    private List<Figures> listOfFigures = new ArrayList<>();

    public void addFigures(Figures figures) {
        listOfFigures.add(figures);
    }


    public int perimeterOfAllFigures() {
        int sumOfPerimeters = 0;
        for (int i = 0; i < listOfFigures.size(); i++) {
            sumOfPerimeters += listOfFigures.get(i).getPerimeter();
        }
        return sumOfPerimeters;
    }

    public double areaOfAllFigures() {
        double sumOfAreas = 0;
        for (int i = 0; i < listOfFigures.size(); i++) {
            sumOfAreas += listOfFigures.get(i).getArea();
        }
        return sumOfAreas;
    }

    public List<String> namesOfAllFigures() {
        List<String> names = new ArrayList<>();
        for (int i = 0; i < listOfFigures.size(); i++) {
            names.add(listOfFigures.get(i).getName());
        }
        return names;
    }

    public Map<String, Integer> mapOfFigures() {
        Map<String, Integer> result = new HashMap<>();
        int numOfSquare = 0;
        int numOfRectangle = 0;
        int numOfCircle = 0;
        int numOfSphere = 0;
        for (int i = 0; i < listOfFigures.size(); i++) {
            Figures f = listOfFigures.get(i);
            if (f instanceof Square) {
                numOfSquare++;
                result.put((listOfFigures.get(i).getName()), numOfSquare);
            }
            if (f instanceof Rectangle) {
                numOfRectangle++;
                result.put((listOfFigures.get(i).getName()), numOfRectangle);
            }
            if (f instanceof Circle) {
                numOfCircle++;
                result.put((listOfFigures.get(i).getName()), numOfCircle);
            }
            if (f instanceof Sphere) {
                numOfSphere++;
                result.put((listOfFigures.get(i).getName()), numOfSphere);
            }

        }
            return result;
    }
}