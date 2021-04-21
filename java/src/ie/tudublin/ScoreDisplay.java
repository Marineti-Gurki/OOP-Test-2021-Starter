package ie.tudublin;

import java.time.Duration;
import java.util.ArrayList;

import com.jogamp.newt.event.GestureHandler;

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
	int halfW = width / 2;
	int halfH = height / 2;
	
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
				Note note = new Note (this, result, 1);
				notes.add(note);
			}
			else
			{
				char result = score.charAt(i);
				char result2 = score.charAt(i+1);
				
				if(Character.isDigit(result2))
				{
					int duration = result2 - '0';
					Note note = new Note(this, result, duration);
					notes.add(note);
				}
				else
				{
					Note note1 = new Note(this, result, 1);
					Note note2 = new Note(this, result2, 1);
					notes.add(note1);
					notes.add(note2);
				}
			}


			// notes.add(score);
			println(notes);
		}
	}
	
	
	
	public void setup() 
	{
		loadScore();
	}
	
	public void draw()
	{
		background(255);
		for(int i = 0; i < 6; i++)
		{
			for(int k = 150; k < 400; k+=50)
			{
				line(50, k, width - 50, k);
			}
		}
		drawNotes();
	}
	
	public void drawNotes()
	{
		for(int i = 0; i < notes.size(); i++)
		{
			Note note = notes.get(i);
			int x = 50;
			int y = i;
			if (note.getDuration() == 1)
            { 
                circle(x+i, y, 40);
                fill(0);
                line(x+20, y, x+20, y-80);
                //displays right note
                textSize(26);
                text(note.getNote(), x - 5, 100);
            }
			if (note.getDuration() == 2)
            { 
				for(int j = 0; j <  notes.size(); j++)
				{
					circle(x+j, y, 40);
					fill(0);
					line(x+20, y, x+20, y-80);
					textSize(26);
					text(note.getNote(), x - 5, 100);
				}
            }
		}
	}
	
	public String getScore() {
	return score;
	}
	
	public void setScore(String score) {
	this.score = score;
	}
	
	public ArrayList<Note> getNotes() {
	return notes;
	}
	

	public void setNotes(ArrayList<Note> notes) {
	this.notes = notes;
	}
	
	// @Override
	// public String toString() 
	// {
	// return "ScoreDisplay [notes=" + notes + ", score=" + score + "]";
	// }
}
