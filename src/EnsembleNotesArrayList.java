
import java.util.*;

/**
La classe pour stocker l'ensemble de notes dans une array list
*/
public class EnsembleNotesArrayList implements EnsembleNotes {
	ArrayList<Note> notes;
	
	public EnsembleNotesArrayList () {
		notes = new ArrayList<Note>();
	}
	
	public void addNote(double note) {
		notes.add(new Note(note));
	}
	
	public int getNbNotes() {
		return notes.size();
	}
	
	public Note getNote(int i) {
		return notes.get(i);
	}
	
	ArrayList<Note> getNotes() {
		return notes;
	}
	
	public IterateurNotes creerIterateurNotes() {
		return new IterateurNotesArrayList(this);
	}
}