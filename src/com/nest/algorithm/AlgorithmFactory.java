package com.nest.algorithm;

import com.nest.algorithm.my_project.Example;
import com.nest.common.AlgorithmEnum;

/**
 * 产生算法实例的工厂
 *
 * @author Zp
 * @version v1.0
 * @date 2018/3/21
 */
public class AlgorithmFactory {
    public static BaseAlgorithm createAlgorithm(AlgorithmEnum algorithmEnum){

        switch(algorithmEnum){
            case EXAMPLE:
                //返回算法类的实例对象
                return new Example();
            default:
                break;
        }

        return null;
    }
}
