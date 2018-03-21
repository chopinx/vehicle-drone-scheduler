package com.nest;

import com.nest.display.Display;

import static java.lang.Thread.sleep;


public class Main {

    public static void main(String[] args) {
        // 示例
        Display display = new Display("vrp");
        while (true){
            if (display.getCurrAlgorithm() != null){
                display.draw(display.getCurrAlgorithm().getDisplayBuffer());
            }

            // 主线程负责画图，保持30毫秒画一次
            try {
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}