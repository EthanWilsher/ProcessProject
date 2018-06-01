package sample.model;

import java.util.Scanner;
import sample.model.PlayDohCircle;
import sample.model.PlayDohTube;
public class SampleController
{
	public SampleController() 
	{
		
	}
	public void start()

	{
		PlayDohTube firstTube= new PlayDohTube();
		PlayDohTube secondTube;
		secondTube = new PlayDohTube();
		PlayDohTube thirdTube;
		thirdTube= new PlayDohTube(10);
		
		
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle secondCircle;
		secondCircle = new PlayDohCircle();
		PlayDohCircle thirdCircle;
		thirdCircle = new PlayDohCircle(10);
		
		
		System.out.println("Here is my Play Doh Circle");
		System.out.println(firstCircle);
		System.out.println("Here is my second circle " + secondCircle);
		System.out.println("Here is my Play Doh Tube");
		System.out.println(firstTube);
		
		
		System.out.println("This is  sample project to show off github and");
		System.out.println("eclipse process so i develop muscle memory :D");
	
		testScanner();
	}
	
	private void testScanner()
	{
		Scanner firstScanner; // Declares a Scanner object.
		firstScanner = new Scanner(System.in); // Instanciates a Scanner object.
		System.out.println("Please type your favorite food");
		String answer = firstScanner.nextLine();
		System.out.println("Oh, you like to eat " + answer + ". that's hella wicked Yo!");
		System.out.println("How old are you???");
		int ageAnswer = firstScanner.nextInt();
		System.out.println("You said that you are " + ageAnswer + " years old");
		
		PlayDohCircle changeCircle = new PlayDohCircle();
		System.out.println("Here is the circle before I change it");
		System.out.println(changeCircle);
		System.out.println("Type in a new size - use numbers please.");
		int mySize = firstScanner.nextInt();
		changeCircle.setSize(mySize);
		System.out.println("Now look at the circle");
		System.out.println(changeCircle);
		
	}
}
