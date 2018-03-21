package com.nest.base;

/**
 * 一句话描述类的功能
 *
 * @author Zp
 * @version v1.0
 * @date 2018/3/21
 */
public abstract class BaseAlgorithm implements Runnable {

    /**
     * 标志位：判断算法是否开启
     */
    private boolean isRunning;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }
}
