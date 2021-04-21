package ie.tudublin;


public class Note 
{
    private int duration;
	private char note;

    @Override
    public String toString() {
        return "Note [duration=" + duration + ", note=" + note + "]";
    }
    public Note()
    {

    }

    public Note(int duration, char note)
    {
        this.duration = duration;
        this.note = note;

    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public char getNote() {
        return this.note;
    }

    public void setNote(char note) {
        this.note = note;
    }
}