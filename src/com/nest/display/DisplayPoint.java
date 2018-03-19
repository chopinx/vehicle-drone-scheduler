package com.nest.display;

import java.awt.Color;

import com.nest.geometry.Point;

/**
 *  画点
 * @author tfl
 * @date 2018-3-19
 * @version v1.0
 */
class DisplayPoint{
	public Point point;
	public float width;
	public Color color;
	
	/**
	 * Constructor
	 * @param point - 点
	 * @param width - 点的大小
	 * @param color - 点的颜色
	 */
	public DisplayPoint(Point point, float width,Color color){
		// TODO Auto-generated constructor stub
		this.color = color;
		this.point = point;
		this.width = width;
	}
}
