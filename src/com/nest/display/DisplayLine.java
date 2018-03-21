package com.nest.display;

import java.awt.Color;

import com.nest.common.Point;

/**
 *  画线
 * @author tfl
 * @date 2018-3-19
 * @version v1.0
 */
class DisplayLine{
	public Color color;
	public float width;
	public Point soulPoint;
	public Point desPoint;
	
	/**
	 * Constructor
	 * @param soulPoint - 起始点
	 * @param desPoint - 目的点
	 * @param width - 宽度
	 * @param color - 颜色
	 */
	public DisplayLine(Point soulPoint, Point desPoint, float width,Color color){
		this.soulPoint = soulPoint;
		this.desPoint = desPoint;
		this.color = color;
		this.width = width;
	}

}
