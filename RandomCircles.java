package week2;

import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

/*
 * This program draws a set of ten circles with different sizes, 
 * positions, and colors. Each circle will have a randomly chosen color, a 
 * randomly chosen radius between 5 and 50 pixels, and a randomly chosen position
 * on the canvas, subject to the condition that the entire circle must fit inside
 *  the canvas without extending past the edge. 
 */

public class RandomCircles extends GraphicsProgram {
	
	public RandomGenerator randgen = RandomGenerator.getInstance();
	private final int NumCircles = 10;
	private final int MIN_RADIUS = 5;
	private final int MAX_RADIUS = 50;
	
	public void run() {
		for (int i = 0; i < NumCircles; i++) {
			double radius = randgen.nextDouble(MIN_RADIUS, MAX_RADIUS);
	        double x = randgen.nextDouble(0, getWidth() - radius * 2);
	        double y = randgen.nextDouble(0, getHeight() - radius * 2);
	        GOval circle = new GOval(x, y, radius, radius);
	        circle.setFilled(true);
	        circle.setColor(randgen.nextColor());
	        add(circle);
		}
	}

}
