package com.nest.display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JPanel;
import com.nest.common.Point;
/**
 *  画点
 * @author tfl
 * @date 2018-3-19
 * @version v1.0
 */
class ShowPoint extends JPanel{
	private Set<DisplayPoint> pointSet;
	
	/**
	 * Constructor
	 * @param point - 待显示的点
	 * @param width - 宽度
	 * @param color - 颜色
	 */
	ShowPoint(Point point, float width, Color color){
		pointSet = new HashSet<>();
		pointSet.add(new DisplayPoint(point, width, color));
	}
	
	/**
	 * Constructor
	 * @param pointSet - 待显示的点的集合
	 * @param width - 宽度
	 * @param color - 颜色
	 */
	ShowPoint(Set<Point> pointSet, float width, Color color){
		pointSet = new HashSet<>();
		for(Point point : pointSet){
			this.pointSet.add(new DisplayPoint(point, width, color));
		}
	}
	

	ShowPoint(Set<DisplayPoint> pointSet){
		this.pointSet = new HashSet<>();
		this.pointSet.addAll(pointSet);
	}
	
	@Override
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;

		for(DisplayPoint point : pointSet){
			g2.setColor(point.color);
			g2.drawOval((int)point.point.getX(), (int)point.point.getY(), (int)point.width, (int)point.width);
			g2.fillOval((int)point.point.getX(), (int)point.point.getY(), (int)point.width, (int)point.width);
		}
	}
}
