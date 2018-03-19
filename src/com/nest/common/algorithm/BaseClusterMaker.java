package com.nest.common.algorithm;

import com.nest.common.geometry.Clusterable;

import java.util.ArrayList;
import java.util.Set;

/**
 * 聚类算法基类，包含聚类算法的基础方法
 * @author xiaoq
 * @date 2018/3/16 11:40
 * @version [v1.0]
 */
abstract class BaseClusterMaker {
    protected Set<Clusterable> pointSet;

    protected ArrayList<BaseCluster> clusterList;

    /**
     * 初始化
     */
    abstract void init();

    /**
     * 聚类的抽象方法
     */
    public void cluster(){
        init();
        while(!endCondition()){
            doCluster();
        }
    }

    /**
     * 终止条件判断
     * @return 当满足终止条件时返回true
     */
    abstract boolean endCondition();

    /**
     * 进行一轮聚类
     */
    abstract void doCluster();
}
