package ie.tudublin;

import java.util.ArrayList;

// import ddf.minim.AudioOutput;
// import ddf.minim.Minim;
// import ddf.minim.signals.Oscillator;
// import ddf.minim.ugens.Oscil;
// import ddf.minim.ugens.Instrument;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	// String score = "DEFGABcd";
	String score = "D2E2F2G2A2B2c2d2";
	static ArrayList<String> notes = new ArrayList<String>();
	static char result;
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	char test;
	
	
	
	public void settings()
	{
		size(1000, 500);
		// How to convert a character to a number
		// char c = '7'; // c holds the character 7 (55)
		// int i = c - '0'; // i holds the number 7 (55 - 48) 
		// println(i);

	}
	
	public void loadScore()
	{
		for(int i = 0; i < score.length(); i++)
		{
			result = score.charAt(i);
			if(Character.isDigit(result))
			{
				test = result;
			}
			String t = String.valueOf(test);
			String notecombine = result+t;
			String score = String.valueOf(notecombine);
			notes.add(score);
			println(notes);
		}
	}
	
	// @Override
	// public String toString() {
		// 	return "ScoreDisplay [notes=" + notes + ", result=" + result + ", score=" + score + "]";
		// }
		

		public void setup() 
		{
			loadScore();
			Note.notelist();
		}
		
		public void draw()
		{
			background(255);
		}

	void drawNotes()
	{
	}
}
