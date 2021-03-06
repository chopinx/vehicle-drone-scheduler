package com.nest.algorithm;

import com.nest.common.Clusterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 簇的基类，用于聚类算法
 * @author xiaoq
 * @version v1.0
 * @date 2018/3/16
 */
public class BaseCluster {
    /**
     * 类的中心点
     */
    protected Clusterable centerPoint;
    /**
     * 类中的节点集合
     */
    protected Set<Clusterable> pointSet = new HashSet<>();

    /**
     * 从类中删除一个节点
     *
     * @param node 待删除的节点
     * @return boolean
     */
    public boolean deleteNode(Clusterable node) {
        return pointSet.remove(node);
    }

    /**
     * 计算中心点坐标
     */
    public void calCenterPoint() {
        if (pointSet == null) {
            return;
        }
        List<Double> coordinate = new ArrayList<>();
        for (Clusterable node : pointSet) {
            while (coordinate.size() < node.getDimension()){
                coordinate.add(0.0);
            }
            for (int i = 0; i < node.getDimension(); i++) {
                coordinate.set(i, coordinate.get(i) + node.getCoordinate(i));
            }
        }
        for (int i = 0; i < coordinate.size(); i++) {
            centerPoint.setCoordinate(coordinate.get(i) / pointSet.size(), i);
        }
    }

    /**
     * 得到簇的大小
     *
     * @return int
     */
    int getClusterSize() {
        return pointSet.size();
    }
}
