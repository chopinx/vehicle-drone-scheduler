package com.nest.geometry;

/**
 * Created by qiu on 18-3-16.
 */
public  abstract class Line {
    Point start;
    Point end;
    double length;

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
