import java.awt.*;

public abstract class GraphicObject
{
	/**
	 * The x and y values of the shape
	 */
	double x,y;

	/**
	 * The color of the shape
	 */
	Color color;

	/**
	 * Creates a new GraphicsObject with the given x, y, and color values
	 * @param newX The x coordinate of the object
	 * @param newY The y coordinate of the object
	 * @param red The red value of the object
	 * @param green The green value of the object
	 * @param blue The blue value of the object
	 */
	public GraphicObject(double newX, double newY, int red, int green, int blue)
	{
		x = newX;
		y = newY;
		color = new Color(red, green, blue);
	}

	/**
	 * @return X value of object
	 */
	public double getX()
	{
		return x;
	}

	/**
	 * @return Y value of object
	 */
	public double getY()
	{
		return y;
	}

	/**
	 * @return Color of object
	 */
	public Color getColor()
	{
		return color;
	}

	/**
	 * Returns the current object as a string in this format: <br>
	 * x: <br>
	 * y: <br>
	 * Color: <br>
	 * r: <br>
	 * g: <br>
	 * b: <br>
	 * Class:
	 * @return
	 */
	public String toString()
	{
		String output = "";

		output += "x: " + x + "\n";
		output += "y: " + y + "\n";
		output += "Color: \n" +
				"\tr: " + color.getRed() + "\n" +
				"\tg: " + color.getGreen() + "\n" +
				"\tb: " + color.getBlue() + "\n";
		output += "Class: " + getClass() + "\n";

		return output;
	}

	/**
	 * Draws the object
	 */
	public abstract void draw();

	/**
	 * Calculates the area of the object
	 * @return Area
	 */
	public abstract double calculateArea();

	/**
	 * Calculates the perimeter of the object
	 * @return Perimeter
	 */
	public abstract double calculatePerimeter();

}
