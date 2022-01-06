public class Square extends GraphicObject
{
	double sideLength;

	/**
	 * Creates a new Square object from the given x, y, color, and sidelength
	 * @param newX The x coordinate of the object
	 * @param newY The y coordinate of the object
	 * @param red The red value of the object
	 * @param green The green value of the object
	 * @param blue The blue value of the object
	 * @param sideLength The length of each side
	 */
	public Square(double newX, double newY, int red, int green, int blue, double sideLength)
	{
		super(newX, newY, red, green, blue);
		this.sideLength = sideLength;
	}

	@Override
	public void draw()
	{
		StdDraw.setPenColor(this.color);
		StdDraw.filledSquare(x, y, sideLength);
	}

	@Override
	/**
	 * Calculates the area of the Square using sideLength^2
	 */
	public double calculateArea()
	{
		return Math.pow(sideLength, 2);
	}

	@Override
	/**
	 * Calculates the perimeter of the Square using 4*sideLength
	 */
	public double calculatePerimeter()
	{
		return 4 * sideLength;
	}
}
