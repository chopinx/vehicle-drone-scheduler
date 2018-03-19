package com.nest.geometry;
/**
 * 可聚类的借口，提供聚类算法中需要的操作方法
 * @author xiaoq
 * @date 2018/3/16 11:40
 * @version [v1.0]
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
