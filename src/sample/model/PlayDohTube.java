package sample.model;

public class PlayDohTube
{
	private int length;
	
	public PlayDohTube()
	{
		this.length = 4;
	}
	public PlayDohTube(int length)
	{
		this.length = length;
	}
	
	public String toString()
	{
		String description = "I am a Play Doh Tube and my length is " + length;
		return description;
	}
}
