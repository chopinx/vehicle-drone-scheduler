package com.nest.algorithm.my_project;

import com.nest.algorithm.BaseAlgorithm;

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
    public void run() {
        System.out.println("算法运行示例");
        while(isRunning()){
            try{
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
