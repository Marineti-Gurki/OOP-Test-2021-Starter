package ie.tudublin;

public class Note extends ScoreDisplay{
    private char note;
    private int duration;


    public Note(ScoreDisplay ScoreDisplay, char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    public char getNote() {
        return note;
    }
    public void setNote(char note) {
        this.note = note;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Note = [duration=" + duration + ", note=" + note + "]";
    }
    
}
