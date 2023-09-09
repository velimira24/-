import java.util.*;

public class GeometryFigure {
    private static List<iShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<iShape>();
    }

    // Метод для добаления новой фигуры
    public void add(iShape figure) {
        toolbox.add(figure);
    }

    // Метод для удаления фигуры
    public void remove(int num) {
        if (num >= 0 && num < toolbox.size()) {
            toolbox.remove(num);
            System.out.println("Фигура с номером " + num + " удалена");
        } else {
            System.out.println("Фигура с номером " + num + " не может быть удалена, так как не существует");
        }
    }

    // Метод поиска необходимой фигуры
    public void search(iShape figure) {
        int index = toolbox.indexOf(figure);
        if (index >= 0) {
            System.out.println("Фигура найдена, её индекс - " + index);
        } else {
            System.out.println("Фигура не найдена");
        }
    }

    // Метод отображения информации о фигуре
    public void getInfo(int num) {
        if (num >= 0 && num < toolbox.size()) {
            iShape figure = toolbox.get(num);
            System.out.println("Площадь фигуры " + figure.getArea());
            System.out.println("Периметр фигуры " + figure.getPerimeter());
        } else {
            System.out.println("Фигура с номером " + num + " не найдена");
        }
    }
}