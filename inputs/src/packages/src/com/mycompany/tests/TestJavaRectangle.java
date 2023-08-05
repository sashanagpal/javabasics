package com.mycompany.tests;

import java.awt.Rectangle;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestJavaRectangle extends JPanel {

	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Rectangle r = new Rectangle(20, 20, 200, 250);

		r.add(new Point(40, 40));

		g2.fill(r);

	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.getContentPane().add(new TestJavaRectangle());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

}
