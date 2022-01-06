public class Circle extends GraphicObject
{
	double radius;

	/**
	 * Creates a new Circle object with the given x, y, color, and radius
	 * @param newX The x coordinate of the object
	 * @param newY The y coordinate of the object
	 * @param red The red value of the object
	 * @param green The green value of the object
	 * @param blue The blue value of the object
	 * @param newRadius The radius of the object
	 */
	public Circle(double newX, double newY, int red, int green, int blue, double newRadius)
	{
		super(newX, newY, red, green, blue);

		radius = newRadius;
	}

	@Override
	public void draw()
	{
		StdDraw.setPenColor(this.color);
		StdDraw.filledCircle(x, y, radius);
	}

	@Override
	/**
	 * Calculates the area of the Circle using PI*radius^2
	 */
	public double calculateArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	/**
	 * Calculates the radius(circumference) of the circle using 2*PI*radius
	 */
	public double calculatePerimeter()
	{
		return  2 * Math.PI * radius;
	}
}
