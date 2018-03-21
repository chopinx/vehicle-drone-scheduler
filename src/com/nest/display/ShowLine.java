package com.nest.display;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JPanel;

import com.nest.common.Point;

/**
 *  画线
 * @author tfl
 * @date 2018-3-19
 * @version v1.0
 */
public class ShowLine extends JPanel {
	private Set<DisplayLine> lineSet;

	/**
	 * 画线
	 * @param soulPoint - 起始点
	 * @param desPoint - 目的点
	 * @param width - 宽度
	 * @param color - 颜色
	 */
	public ShowLine(Point soulPoint, Point desPoint, float width, Color color) {
		lineSet = new HashSet<>();
		lineSet.add(new DisplayLine(soulPoint, desPoint, width, color));
	}


	/**
	 *  画路径
	 * @param path - 待显示的路径
	 * @param width - 宽度
	 * @param color - 颜色
	 */
	public ShowLine(ArrayList<Point> path, float width, Color color) {
		// TODO Auto-generated constructor stub
		lineSet = new HashSet<>();
		Iterator<Point> it = path.iterator();
		Iterator<Point> itPre = path.iterator();
		if (it.hasNext()) {
			it.next();
			while(it.hasNext() && itPre.hasNext()){
				Point desPoint = it.next();
				Point soulPoint = itPre.next();
				lineSet.add(new DisplayLine(soulPoint, desPoint, width, color));
			}
		}
	}
	
	/**
	 * Constructor
	 * @param lineSet - 待显示的路径集合
	 */
	public ShowLine(Set<DisplayLine> lineSet) {
		this.lineSet = new HashSet<>();
		this.lineSet.addAll(lineSet);
	}

	@Override
	public void paintComponent(Graphics g){
		//super.paintComponent(g);   
		Graphics2D g2 = (Graphics2D)g;
		for(DisplayLine line : lineSet){
			g2.setColor(line.color);
			Line2D.Double line1 =  new Line2D.Double(line.soulPoint.getX(),
					line.soulPoint.getY(), line.desPoint.getX(), line.desPoint.getY());
			g2.setStroke(new BasicStroke(line.width));
			g2.draw(line1);
		}
	}
}
