package com.nest;

import com.nest.display.Display;



public class Main {

    public static void main(String[] args) {
        // 示例
        Display display = new Display("vrp");
        while (true){
            if (display.getCurrAlgorithm() != null){
                display.draw(display.getCurrAlgorithm().getDisplayBuffer());
            }
        }
    }
}