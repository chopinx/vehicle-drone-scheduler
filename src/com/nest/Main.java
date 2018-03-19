package com.nest;

import com.nest.display.Display;
import com.nest.geometry.Point;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // 示例
        Point point1 = new Point(2,3);
        Point point2 = new Point(56,93);
        Display display = new Display("mdc");
        display.drawPoint(point1);
        display.drawPoint(point2, 8, Color.BLUE);
        display.drawLine(point1,point2);
        display.drawCircle(300, 300, 50);
    }
}