import java.util.ArrayList;
import java.util.List;

/**
Implémentation de l'itérateur pour parcourir un tableau
*/
public class IterateurNotesTableau implements IterateurNotes {

	private EnsembleNotesTableau notes;
	private int index;
	private int maxIndex;
	
	public IterateurNotesTableau(EnsembleNotesTableau list) {
		notes = list;
		maxIndex = notes.getNbNotes() - 1;
	}
	
	@Override
	public void premier() {
		index = 0;
	}

	@Override
	public void suivant() {
		index += 1;
	}

	@Override
	public boolean termine() {
		return index >= maxIndex;
	}

	@Override
	public Note noteCourante() {
		return notes.getNote(index);
	}

}
