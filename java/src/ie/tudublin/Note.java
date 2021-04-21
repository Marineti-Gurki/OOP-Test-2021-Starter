package ie.tudublin;

public class Note extends ScoreDisplay {
    private char note;
    private int duration;
    private int number;

    public Note(char note, int duration, int number) {
        this.note = note;
        this.duration = duration;
        this.number = number;
    }

    public void notelist()
    {
        
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
    
}
