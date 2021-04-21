package ie.tudublin;

public class Note extends ScoreDisplay {
    private char note;
    private static int duration;
    private int number;

    public Note(char note, int duration, int number) {
        this.note = note;
        this.duration = duration;
        this.number = number;
    }

    public static void notelist()
    {
       for(int i = 0; i < notes.size(); i++)
       {
            
       }
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
