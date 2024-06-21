import java.util.ArrayList;
import ardoise.*;

public class GF extends Forme {

    private ArrayList<Forme> formes;

    public GF() {
        super();
        formes = new ArrayList<Forme>();
    }

    public void ajouterForme(Forme forme) {
        try {
            if (formes.contains(forme)) {
                throw new IllegalArgumentException("Une forme avec le même nom existe déjà dans l'ardoise.");
            }
            formes.add(forme);
        } catch (IllegalArgumentException e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors de l'ajout de la forme à GF : " + e.getMessage());
        }
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        try {
            for (int i = 0; i < formes.size(); i++) {
                formes.get(i).deplacer(deplacementX, deplacementY);
            }
        } catch (Exception e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors du déplacement des formes dans GF : " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<Segment>();
        try {
            for (int i = 0; i < formes.size(); i++) {
                segments.addAll(formes.get(i).dessiner());
            }
        } catch (Exception e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors du dessin des formes dans GF : " + e.getMessage());
        }
        return segments;
    }

    @Override
    public String typeForme() {
        return "GF";
    }
}
