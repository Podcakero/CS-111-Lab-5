import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tester
{

	public static void main(String[] args)
	{
		GraphicObject[] arr = new GraphicObject[20];

		// set the scale for the x/y axis
		StdDraw.setCanvasSize(1000, 1000);
		StdDraw.setXscale(0, 1000);
		StdDraw.setYscale(0, 1000);

		StdDraw.setPenRadius(0.02);

		boolean worked = false;

		while (!worked)
		{
			Scanner scan = new Scanner(System.in);

			System.out.println("Name of test file: ");

			try
			{
				Path path = Paths.get(scan.nextLine());

				Scanner filename = new Scanner(path);

				ObjectOperations.fillArray(arr, filename);

				worked = true;
			} catch (IOException e)
			{
				System.out.println(e);
			}
		}
	}
}
