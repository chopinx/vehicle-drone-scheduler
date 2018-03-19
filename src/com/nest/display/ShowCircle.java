package com.nest.display;

import javax.swing.*;
import java.awt.*;

/**
 * 画圆
 *
 * @author tfl
 * @version v1.0
 * @date 2018/3/19
 */
public class ShowCircle extends JPanel {
    private int x = 0;
    private int y = 0;
    private int width = 1;
    private Color color;

    /**
     * Constructor
     * @param x - 圆心x轴坐标
     * @param y - 圆心y轴坐标
     * @param width - 宽度
     * @param color - 颜色
     */
    ShowCircle(float x, float y, float width, Color color){
        this.x = (int)x;
        this.y = (int)y;
        this.width = (int)width;
        this.color = color;

    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(color);
        g2.drawOval(x, y, width, width);
    }
}
