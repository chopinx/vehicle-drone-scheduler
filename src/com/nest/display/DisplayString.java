package com.nest.display;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *  写字符串
 * @author tfl
 * @date 2018-3-19
 * @version v1.0
 */
public class DisplayString extends JPanel {

	public String str;
	public float x;
	public float y;

	/**
	 * Constructor
	 * @param str - 待显示的字符
	 * @param x - x轴坐标
	 * @param y - y轴坐标
	 */
	public DisplayString(String str, float x, float y) {
		this.str = str;
		this.x = x;
		this.y = y;
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.drawString(str, x, y);
	}
}
