package com.nest.geometry;

/**
 * 可用TSP的接口，提供TSP算法中对象需要的方法
 * @author xiaoq
 * @version v1.0
 * @date 2018/3/19
 */
public interface Travelable {
    /**
     * 获取该对象到目标对象的距离
     * @param des 目标点
     * @return 返回到目标点的距离
     */
    double getDistance(Travelable des);
}
