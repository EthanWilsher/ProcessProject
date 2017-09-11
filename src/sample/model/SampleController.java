package sample.model;

import java.util.Scanner;

public class SampleController
{
	public SampleController() 
	{
		
	}
	public void start()

	{
		PlayDohCircle firstCircle = new PlayDohCircle();
		PlayDohCircle second Circle;
		secondCircle = new PlayDohCircle();
		PlayDohrcle thirdCircle;
		thirdCircle = new PlayDohCircle();
		
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
		System.out.println("Oh, you like to eat " + answer);
	}
}
