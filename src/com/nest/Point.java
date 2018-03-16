/**
 * Created by qiu on 18-3-16.
 */
public class Point implements Clusterable{
    private int x;//横坐标
    private int y;//纵坐标

    Point() {
        super();
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    /*
    返回节点与原点的欧几里得距离
     */
    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }

    /*
    返回当前节点与指定节点的欧几里得距离
     */
    public double getDistance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
    }
}
