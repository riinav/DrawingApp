package drawingapp;

import java.util.List;

public class Triangle2 {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }
    
    public void draw() {
        for (Point point : points) {
            System.out.println("point: (" + point.getX() + ", " + point.getY() + ")");
        }
    }
}
