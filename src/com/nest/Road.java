package com.nest;
/**
 * Created by qiu on 18-3-16.
 */
public class Road extends Line {
    Road(Point start , Point end){
        this.start = start;
        this.end = end;
        distance = start.getDistance(end);
    }
}
