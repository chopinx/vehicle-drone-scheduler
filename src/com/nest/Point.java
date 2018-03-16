package com.nest;
/**
 * Created by qiu on 18-3-16.
 */
public class Point implements Clusterable{
    /**
     * 横坐标
     */
    private double x;
    /**
     * 纵坐标
     */
    private double y;

    Point() {
        super();
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     *
     * @return 返回节点与原点的欧几里得距离
     */
    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }

    /*
    返回当前节点与指定节点的欧几里得距离
     */

    /**
     *
     * @param point 目标点
     * @return 返回点距离
     */
    public double getDistance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
    }

    /**
     * @param index 坐标维度
     * @return 返回指定维度的坐标
     */
    @Override
    public double getCoordinate(int index) {
        if (index == 0) {return x;}
        if (index == 1) {return y;}
        System.out.println("Point.getCoordinate error: the index is out of range!");
        return 0;
    }

    /**
     * @return 获取待聚类点的维数
     */
    @Override
    public int getDimension() {
        return 2;
    }

    /**
     * @param coordinate 坐标值
     * @param index      坐标维度
     */
    @Override
    public void setCoordinate(double coordinate, int index) {
        if (index == 0) {x = coordinate;}
        if (index == 1) {y = coordinate;}
        System.out.println("Point.setCoordinate error: the index is out of range!");
    }
}
