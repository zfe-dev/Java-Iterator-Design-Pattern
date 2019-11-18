
/**
Le client générique pour tester le cacul d'une moyenne d'un ensemble de notes avec le pattern Iterateur
Cette classe est générique car elle ne connait l'ensemble de notes que par l'interface EnsembleNotes
*/
public class ClientEnsembleNotes {
	private EnsembleNotes en;
	
	public ClientEnsembleNotes(EnsembleNotes en) {
		this.en = en;
	}
	
	public double calculerMoyenne() {
		IterateurNotes itera = this.en.creerIterateurNotes();
		double sum = 0;
		int i = 0;
		while (!itera.termine()) {
			i += 1;
			itera.suivant();
			sum += itera.noteCourante().getValeur();
		}
		return sum / i;
	}
}