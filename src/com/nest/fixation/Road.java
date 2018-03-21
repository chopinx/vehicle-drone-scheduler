package com.nest.fixation;

import com.nest.common.Line;
import com.nest.common.Point;

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
