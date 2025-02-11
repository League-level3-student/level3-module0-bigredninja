package _05_Pixel_Art;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.util.Iterator;

import javax.swing.JPanel;

public class GridPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private int windowWidth;
	private int windowHeight;
	private int pixelWidth;
	private int pixelHeight;
	private int rows;
	private int cols;

	// 1. Create a 2D array of pixels. Do not initialize it yet.
	private Pixel grid[][];// definition
	private Color color;

	public GridPanel(int w, int h, int r, int c) {
		this.windowWidth = w;
		this.windowHeight = h;
		this.rows = r;
		this.cols = c;

		this.pixelWidth = windowWidth / cols;
		this.pixelHeight = windowHeight / rows;

		color = Color.BLACK;

		setPreferredSize(new Dimension(windowWidth, windowHeight));

		// 2. Initialize the pixel array using the rows and cols variables.
		grid = new Pixel[rows][cols];// Initialization

		// 3. Iterate through the array and initialize each element to a new pixel.
		for (int i = 0; i < grid.length; i++) {

			// Loop through each element in the 2D array
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = new Pixel(i, j);
			}
		}

	}

	public void setColor(Color c) {
		color = c;
	}

	public void clickPixel(int mouseX, int mouseY) {
		// 5. Use the mouseX and mouseY variables to change the color
		// of the pixel that was clicked. *HINT* Use the pixel's dimensions.
		Color pixelColor = new Color(mouseX%100, mouseY, mouseX+1 + mouseY);
		grid[mouseX][mouseY].setColor(pixelColor);
		System.out.println("changing color of mouseX mouseY");
	}

	@Override
	public void paintComponent(Graphics g) {
		// 4. Iterate through the array.
		// For every pixel in the list, fill in a rectangle using the pixel's color.
		// Then, use drawRect to add a grid pattern to your display.
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				Color pixelColor = new Color(i%100, j, i + j);
				grid[i][j].setColor(pixelColor);
			}
		}
	}
}
