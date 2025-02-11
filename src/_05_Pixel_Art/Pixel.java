package _05_Pixel_Art;

import java.awt.Color;

public class Pixel{
    public int x;
    public int y;
    public Color color;

    public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
        color = Color.WHITE;
    }
}
