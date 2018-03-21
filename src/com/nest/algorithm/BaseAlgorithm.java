package com.nest.algorithm;


import com.nest.display.DisplayBuffer;

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

    /**
     * 显示缓存区，所有需要显示的元素都应该存到该缓存区
     */
    protected DisplayBuffer displayBuffer = new DisplayBuffer();

    public abstract void start();

    @Override
    public void run() {
        System.out.println("[" + getAlgorithmName() + "]" + "开始运行");
        start();
        System.out.println("[" + getAlgorithmName() + "]" + "运行结束！");
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public DisplayBuffer getDisplayBuffer() {
        return displayBuffer;
    }

    public abstract String getAlgorithmName();
}
