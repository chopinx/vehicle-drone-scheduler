package com.nest.algorithm.my_project;

import com.nest.algorithm.BaseAlgorithm;
import com.nest.common.Point;
import com.nest.display.DisplayPoint;

import java.awt.*;

import static java.lang.Thread.sleep;

/**
 * 算法类示例
 *
 * @author Zp
 * @version v1.0
 * @date 2018/3/21
 */
public class Example extends BaseAlgorithm{
    @Override
    public void start() {
        int i = 1;
        while (isRunning()){
            Point point = new Point((i++) * 20, 100);
            synchronized (displayBuffer){
                displayBuffer.addPoint(new DisplayPoint(point, 4, Color.BLACK));
            }
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getAlgorithmName() {
        return "示例算法";
    }
}
