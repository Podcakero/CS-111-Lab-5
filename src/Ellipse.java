public class Ellipse extends GraphicObject
{
	double semiMajorAxis, semiMinorAxis;

	/**
	 * Creates a new Ellipse object from the given x, y, color, semiMajorAxis, and semiMinorAxis
	 * @param newX The x coordinate of the object
	 * @param newY The y coordinate of the object
	 * @param red The red value of the object
	 * @param green The green value of the object
	 * @param blue The blue value of the object
	 * @param newSemiMajor The Larger of the 2 axes of the ellipse
	 * @param newSemiMinor The Smaller of the 2 axes of the ellipse
	 */
	public Ellipse(double newX, double newY, int red, int green, int blue, double newSemiMajor, double newSemiMinor)
	{
		super(newX, newY, red, green, blue);
		semiMajorAxis = newSemiMajor;
		semiMinorAxis = newSemiMinor;
	}

	@Override
	public void draw()
	{
		StdDraw.setPenColor(this.color);
		StdDraw.filledEllipse(x, y, semiMajorAxis, semiMinorAxis);
	}

	@Override
	/**
	 * Calculates the area of the Ellipse by using PI*a*b
	 */
	public double calculateArea()
	{
		return Math.PI * semiMinorAxis * semiMajorAxis;
	}

	@Override
	/**
	 * Calculates the perimeter of the object using Ramanujan's method
	 */
	public double calculatePerimeter()
	{
		double h = (Math.pow(semiMajorAxis - semiMinorAxis, 2)) / (Math.pow(semiMajorAxis + semiMinorAxis, 2));

		return Math.PI * (semiMajorAxis + semiMinorAxis) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
	}
}
