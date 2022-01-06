public class Rectangle extends GraphicObject
{
	double length, width;

	/**
	 * Creates a new Rectangle object with the given x, y, color, length, and width
	 * @param newX The x coordinate of the object
	 * @param newY The y coordinate of the object
	 * @param red The red value of the object
	 * @param green The green value of the object
	 * @param blue The blue value of the object
	 * @param newLength The length of the object
	 * @param newWidth The width of the object
	 */
	public Rectangle(double newX, double newY, int red, int green, int blue, double newLength, double newWidth)
	{
		super(newX, newY, red, green, blue);
		length = newLength;
		width = newWidth;
	}

	@Override
	public void draw()
	{
		StdDraw.setPenColor(this.color);
		StdDraw.filledRectangle(x, y, width, length);
	}

	@Override
	/**
	 * Calculates the area of the Rectangle using length*width
	 */
	public double calculateArea()
	{
		return length * width;
	}

	@Override
	/**
	 * Calculates the perimeter of the Rectangle using 2*Length + 2*width
	 */
	public double calculatePerimeter()
	{
		return 2 * length + 2 * width;
	}
}
