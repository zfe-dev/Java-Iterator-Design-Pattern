
import java.util.*;


/**
Implémentation de l'itérateur pour parcourir une array list
*/
public class IterateurNotesArrayList implements IterateurNotes {
	
	private EnsembleNotesArrayList notes;
	private int index;
	private int maxIndex;
	
	
	public IterateurNotesArrayList(EnsembleNotesArrayList list) {
		index = 0;
		notes = list;
		maxIndex = notes.getNbNotes() - 1;
		System.out.println(maxIndex);
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
		