package com.nest.display;

import java.util.ArrayList;
import java.util.List;

/**
 * 显示缓冲类，包含所有需要显示的元素
 * 由于存在同步问题，所有读写该类对象的代码都应该加同步锁
 *
 * @author xiaoq
 * @version v1.0
 * @date 2018/3/21
 */
public class DisplayBuffer {
    private List<DisplayPoint> pointList = new ArrayList<>();
    private List<DisplayLine> lineList = new ArrayList<>();
    private List<DisplayString> stringList = new ArrayList<>();

    public void addPoint(DisplayPoint point){
        pointList.add(point);
    }

    public void addLine(DisplayLine line){
        lineList.add(line);
    }

    public void addString(DisplayString string){
        stringList.add(string);
    }

    public void clear(){
        pointList.clear();
        lineList.clear();
        stringList.clear();
    }

    public List<DisplayPoint> getPointList() {
        return pointList;
    }

    public void setPointList(List<DisplayPoint> pointList) {
        this.pointList = pointList;
    }

    public List<DisplayLine> getLineList() {
        return lineList;
    }

    public void setLineList(List<DisplayLine> lineList) {
        this.lineList = lineList;
    }

    public List<DisplayString> getStringList() {
        return stringList;
    }

    public void setStringList(List<DisplayString> stringList) {
        this.stringList = stringList;
    }
}
