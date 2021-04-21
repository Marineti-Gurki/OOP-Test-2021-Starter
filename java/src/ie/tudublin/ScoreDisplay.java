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
	//Note note;
	String score = "DEFGABcd";
	// String score = "D2E2F2G2A2B2c2d2";
	// String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	ArrayList<Note> notes = new ArrayList<Note>();
	
	
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
		for(int i = 0; i < score.length() - 1; i += 2)
		{
			if(i+1 >= score.length())
			{
				char result = score.charAt(i);
				Note note = new Note (result, 1);
				notes.add(note);
			}
			else
			{
				char result = score.charAt(i);
				char result2 = score.charAt(i+1);
				
				if(Character.isDigit(result2))
				{
					int duration = result2 - '0';
					Note note = new Note(result, duration);
					notes.add(note);
				}
				else
				{
					Note note1 = new Note(result, 1);
					Note note2 = new Note(result2, 1);
					notes.add(note1);
					notes.add(note2);
				}
			}


			// notes.add(score);
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
			// Note.notelist();
		}
		
		public void draw()
		{
			background(255);
		}

	void drawNotes()
	{
	}
}
