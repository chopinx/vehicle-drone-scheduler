package com.nest.app.fixation;

import com.nest.geometry.Line;
import com.nest.geometry.Point;

/**
 * Created by qiu on 18-3-16.
 */
public class Road extends Line {
    Road(Point start , Point end){
        this.setStart(start);
        this.setEnd(end);
        this.setLength(start.getDistance(end));
    }
}
