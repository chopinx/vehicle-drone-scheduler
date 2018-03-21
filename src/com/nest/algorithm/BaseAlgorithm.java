package com.nest.algorithm;


/**
 * 算法的基类
 *
 * @author Zp
 * @version v1.0
 * @date 2018/3/21
 */
public abstract class BaseAlgorithm implements Runnable {

    /**
     * 标志位：判断算法是否开启
     */
    private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
