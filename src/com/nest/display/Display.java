package com.nest.display;

import java.awt.*;
import java.util.ArrayList;
import java.util.Set;
import com.nest.geometry.Point;
import javax.swing.JFrame;

/**
 *  在一个窗口中显示结果,画图时只需调用此类
 * @author tfl
 * @date 2018-3-19
 * @version v1.0
 */
public class Display extends JFrame {

	/**
	 * Constructor
	 * @param str - 窗体名称
	 */
	public Display(String str) {
		// TODO Auto-generated constructor stub
		this.setTitle(str);
		this.setSize(950, 950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}


	/**
	 * Constructor
	 * @param pointSet - 待显示点的集合
	 * @param str - 窗体名称
	 */
	public Display(Set<Point> pointSet, String str) {
		// TODO Auto-generated constructor stub
		//设置窗体名字
		this.setTitle(str);
		this.setSize(950, 950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPoint(pointSet, 4, Color.BLACK);
		this.setVisible(true);
	}


	/**
	 * 画线的默认方法
	 *
	 * @param soulPoint - 起始点
	 * @param desPoint - 目的点
	 */
	public void drawLine(Point soulPoint, Point desPoint) {
		this.add(new ShowLine(soulPoint, desPoint, 2, Color.BLACK));
		this.setVisible(true);
	}

	/**
	 * 画线
	 * 
	 * @param soulPoint - 起始点
	 * @param desPoint - 目的点
	 * @param width - 线段的粗细
	 * @param color - 线段的颜色
	 */
	public void drawLine(Point soulPoint, Point desPoint, Float width, Color color) {
		this.add(new ShowLine(soulPoint, desPoint, width, color));
		this.setVisible(true);
	}


	/**
	 *  画路径的默认方法
	 * @param path - 待显示的路径（由经过的节点表示）
	 */
	public void drawLine(ArrayList<Point> path) {
		// TODO Auto-generated method stub
		this.add(new ShowLine(path, 2, Color.BLACK));
		this.setVisible(true);
	}

	/**
	 *  画路径
	 * @param path - 待显示的路径（由经过的节点表示）
	 * @param width - 路径的宽度
	 * @param color - 路径的颜色
	 */
	public void drawLine(ArrayList<Point> path, float width, Color color) {
		// TODO Auto-generated method stub
		this.add(new ShowLine(path, width, color));
		this.setVisible(true);
	}

	/**
	 * 在指定位置写字
	 * @param str - 待显示的字符串
	 * @param x - x轴坐标
	 * @param y - y轴坐标
	 */
	public void drawString(String str, float x, float y) {
		this.add(new DisplayString(str, x, y));
		this.setVisible(true);
	}

	/**
	 *  画点的默认方法
	 * @param pointSet - 待显示的节点集合
	 */
	public void drawPoint(Set<Point> pointSet) {
		this.add(new ShowPoint(pointSet, 2, Color.BLACK));
		this.setVisible(true);
	}

	/**
	 *  画点
	 * @param pointSet - 待显示的节点集合
	 * @param width - 点的宽度
	 * @param color - 点的颜色
	 */
	public void drawPoint(Set<Point> pointSet, float width, Color color) {
		this.add(new ShowPoint(pointSet, width, color));
		this.setVisible(true);
	}

	/**
	 * 画点的默认方法
	 * @param point - 待显示的点
	 */
	public void drawPoint(Point point) {
		this.add(new ShowPoint(point, 2, Color.BLACK));
		this.setVisible(true);
	}

	/**
	 * 画点
	 * @param point - 待显示的点
	 * @param width - 点的宽度
	 * @param color - 点的颜色
	 */
	public void drawPoint(Point point, float width, Color color) {
		this.add(new ShowPoint(point, width, color));
		this.setVisible(true);
	}

	/**
	 * 画圆
	 * @param x - 圆心的x轴坐标
	 * @param y - 圆心的y轴坐标
	 * @param width - 圆的宽度
	 */
	public void drawCircle(int x, int y, float width){
		drawCircle(x, y, width, Color.BLACK);
	}

	/**
	 * 画圆
	 * @param x - 圆心的x轴坐标
	 * @param y - 圆心的y轴坐标
	 * @param width - 圆的宽度
	 * @param color - 圆的颜色
	 */
	public void drawCircle(int x, int y, float width, Color color){
		this.add(new ShowCircle(x, y, width, color));
		this.setVisible(true);
	}
	/**
	 * 清空显示的内容
	 */
	public void clearPicture() {
		this.add(new ClearPicture());
		this.setVisible(true);
	}
}