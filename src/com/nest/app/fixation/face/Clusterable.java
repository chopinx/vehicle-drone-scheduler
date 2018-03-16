package com.nest.app.fixation.face;
/**
 * Created by qiu on 18-3-16.
 */
public interface Clusterable {
    /**
     *
     * @param index 坐标维度
     * @return 返回指定维度的坐标
     */
    double getCoordinate(int index);

    /**
     *
     * @return 获取待聚类点的维数
     */
    int getDimension();

    /**
     *
     * @param coordinate 坐标值
     * @param index 坐标维度
     */
    void setCoordinate(double coordinate, int index);
}
