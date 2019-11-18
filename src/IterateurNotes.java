
/**
L'interface Itérateur d'un ensemble de notes
*/
interface IterateurNotes {
	public void premier();
	public void suivant();
	public boolean termine();
	public Note noteCourante();
}