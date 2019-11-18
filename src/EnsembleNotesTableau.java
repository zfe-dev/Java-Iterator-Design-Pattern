
/**
La classe pour stocker l'ensemble de notes dans un tableau
*/
public class EnsembleNotesTableau implements EnsembleNotes {
	Note [] notes;
	
	public EnsembleNotesTableau () {
		notes = null;
	}
	
	public void addNote(double note) {
		Note on = new Note(note);
		
		if(notes == null) {
			notes = new Note[1];
			notes[0] = on;
		}
		else {
			Note [] newNotes = new Note[notes.length + 1];
			
			int i;
			for(i = 0; i < notes.length; i++) 
				newNotes[i] = notes[i];
			newNotes[notes.length] = on;
			notes = newNotes;
		}
	}
	
	public int getNbNotes() {
		if(notes == null)
			return 0;
		else
			return notes.length;
	}
	
	public Note getNote(int i) {
		if(notes == null || i < 0 || notes.length <= i) 
			return null;
		else
			return notes[i];
	}
	
	public IterateurNotes creerIterateurNotes() { 
		return new IterateurNotesTableau(this);
	}
}		
