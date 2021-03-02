package week2;

import java.awt.*;
import java.awt.event.*;
import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import acm.program.GraphicsProgram;

/* This program allows the user to draw lines on the canvas. Pressing the
mouse button sets the starting point for the line. Dragging the mouse moves the other
endpoint around as the drag proceeds. Releasing the mouse fixes the line in its current
position and gets ready to start a new line.
*/ 


public class DrawingLines extends GraphicsProgram {

	private GLine line;
	private int x;
	private int y;
	
	
	public void run() {
		addMouseListeners();
	}
	
	public void mousePressed(MouseEvent e) {
		x = e.getX();
	    y = e.getY();
	    line = new GLine(x, y, x, y);
	    add(line);
	}
	
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
	    y = e.getY();
	    line.setEndPoint(x, y);
	}
	
	

}
