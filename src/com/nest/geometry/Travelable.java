package com.nest.geometry;

/**
 * 可用TSP的借口
 * @author xiaoq
 * @version v1.0
 * @date 2018/3/19
 */
public interface Travelable {
    /**
     *
     * @return 返回到目标的距离
     */
    double getDistance(Travelable des);
}
