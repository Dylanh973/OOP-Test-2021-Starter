package ie.tudublin;

import java.util.ArrayList;


import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";

	ArrayList<Note> Notes = new ArrayList<Note>();

	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void setup() 	
	{
		loadScore();
		colorMode(HSB);
	}

	public void draw()
	{
		background(255);
		float border = 0.1f * width;

		
		for(int i = 0 ; i<5 ; i++ ){
			float y = map(i , -5 , 5 , border , height - border);
			line(border, y, width - border, y);
		}
	}
		

	void drawNotes()
	{

	}

 	void loadScore()
 {
	String s = score.substring(0, 8);
	int i = 0;

	while( i < score.length())
	{
		if(Character.isLetter(score.charAt(i))) //Not sure if isLetter should be used here, basically makes sure its a character that gets passed.
		
	}

	for(int i = s.length() - 1; i >= 0; i--)
	{
		System.out.println(s.charAt(i));
	}

 }
}