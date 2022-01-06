import java.util.Scanner;

public class ObjectOperations
{
	/**
	 * This method reads a data file containing information about shapes to be drawn to the screen.
	 * EACH LINE IN THE DATA FILE REPRESENTS A SINGLE SHAPE
	 * @param objectList The array to add the created objects to
	 * @param filename The Scanner object of the file to be read from
	 */
	public static void fillArray(GraphicObject[] objectList, Scanner filename)
	{
		//Keep track of how many objects we've created
		int i = 0;

		while(filename.hasNextLine())
		{
			String nextLine = filename.nextLine();

			//Ensure the file doesn't have an empty line
			if (!nextLine.equalsIgnoreCase(""))
			{
				Scanner scan = new Scanner(nextLine);

				//Call different methods based on the shape.
				switch(scan.next())
				{
					case "C":
						objectList[i] = readCircle(scan);
						break;
					case "R":
						objectList[i] = readReactangle(scan);
						break;
					case "S":
						objectList[i] = readSquare(scan);
						break;
					case "E":
						objectList[i] = readEllipse(scan);
						break;
				}

				//Increment our index
				i++;
			}
		}

		drawList(objectList);
		printList(objectList);
	}

	/**
	 * Creates a new Circle object by reading in values from the scanner object
	 * @param scan The scanner of the current line
	 * @return an Circle
	 */
	private static GraphicObject readCircle(Scanner scan)
	{
		int[] vals = scanBaseValues(scan);

		double radius = scan.nextDouble();
		//scan.nextLine();

		return new Circle(vals[0], vals[1], vals[2], vals[3], vals[4], radius);
	}

	/**
	 * Creates a new Rectangle object by reading in values from the scanner object
	 * @param scan The scanner of the current line
	 * @return an Rectangle
	 */
	private static GraphicObject readReactangle(Scanner scan)
	{
		int[] vals = scanBaseValues(scan);

		double length = scan.nextDouble();
		double width = scan.nextDouble();
		//scan.nextLine();

		return new Rectangle(vals[0], vals[1], vals[2], vals[3], vals[4], length, width);
	}

	/**
	 * Creates a new Square object by reading in values from the scanner object
	 * @param scan The scanner of the current line
	 * @return an Square
	 */
	private static GraphicObject readSquare(Scanner scan)
	{
		int[] vals = scanBaseValues(scan);

		double sideLength = scan.nextDouble();
		//scan.nextLine();

		return new Square(vals[0], vals[1], vals[2], vals[3], vals[4], sideLength);
	}

	/**
	 * Creates a new Ellipse object by reading in values from the scanner object
	 * @param scan The scanner of the current line
	 * @return an Ellipse
	 */
	private static GraphicObject readEllipse(Scanner scan)
	{
		int[] vals = scanBaseValues(scan);

		double semiMinorAxis = scan.nextDouble();
		double semiMajorAxis = scan.nextDouble();

		return new Ellipse(vals[0], vals[1], vals[2], vals[3], vals[4], semiMajorAxis, semiMinorAxis);
	}

	/**
	 * Scans in the values that are the same across all shapes (x, y, red, green blue)
	 * @param scan The scanner of the current line
	 * @return An int array containing the base values
	 */
	private static int[] scanBaseValues(Scanner scan)
	{
		int x = scan.nextInt();
		int y = scan.nextInt();
		int red = scan.nextInt();
		int blue = scan.nextInt();
		int green = scan.nextInt();

		return new int[] {x, y, red, green, blue};
	}

	/**
	 * This method iterates through the objectList and calls the draw method to draw each shape to the screen.
	 * @param objectList The array of GraphicObjects
	 */
	public static void drawList(GraphicObject[] objectList)
	{
		for (GraphicObject object : objectList)
			object.draw();
	}

	/**
	 * This method iterates through the ObjectList and calls the toString method for each object.
	 * @param objectList The array of GraphicObjects
	 */
	public static void printList(GraphicObject[] objectList)
	{
		for (GraphicObject object : objectList)
			System.out.println(object);
	}
}
