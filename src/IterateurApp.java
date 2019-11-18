
public class IterateurApp {


    public static void main (String [] args) {
        new IterateurApp().run();
    }

    private void run() {

        testListe();

        testTableau();

    }

    public void testListe() {

        EnsembleNotesArrayList ent = new EnsembleNotesArrayList();
        

        ent.addNote(5.4);
        ent.addNote(18.5);
        ent.addNote(5.4);
        ent.addNote(12.55);

        ClientEnsembleNotes cen = new ClientEnsembleNotes(ent);
        System.out.println("[ArrayList] La moyenne vaut " + cen.calculerMoyenne());

    }

    public void testTableau() {

        EnsembleNotesTableau ent = new EnsembleNotesTableau();

        ent.addNote(5.4);
        ent.addNote(18.5);
        ent.addNote(5.4);
        ent.addNote(12.55);

        ClientEnsembleNotes cen = new ClientEnsembleNotes(ent);
        System.out.println("[Tableau] La moyenne vaut " +cen.calculerMoyenne());

    }
}

