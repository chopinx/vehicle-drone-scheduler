/**
 * Created by qiu on 18-3-16.
 */
public class Road extends Line {
    Road(Point start , Point end){
        start = this.start;
        end = this.end;
        distance = start.getDistance(end);
    }
}
