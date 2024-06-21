import ardoise.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Chapeau extends Forme {
    private Segment segment1;
    private Segment segment2;
    private Segment segment3;

    public Chapeau(String nom, Segment segment1, Segment segment2) {
        super(nom);
        try {
            if (segment1.getPointDepart().equals(segment2.getPointArrivee())) {
                throw new IllegalArgumentException("Les segments fournis ne forment pas une forme valide.");
            }
            this.segment1 = segment1;
            this.segment2 = segment2;
        } catch (IllegalArgumentException e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors de la création du Chapeau : " + e.getMessage());
        }
    }

    public Segment getSegment1() {
        return segment1;
    }

    public Segment getSegment2() {
        return segment2;
    }

    public Segment getSegment3() {
        try {
            if (segment3 == null) {
                throw new NoSuchElementException("La forme ne possède pas de segment3.");
            }
        } catch (NoSuchElementException e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors de l'accès au segment3 du Chapeau : " + e.getMessage());
        }
        return segment3;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        segments.add(segment1);
        segments.add(segment2);
        return segments;
    }

    @Override
    public void deplacer(int deplacementX, int deplacementY) {
        try {
            if (deplacementX < 0 || deplacementY < 0) {
                throw new IllegalArgumentException("Les valeurs de déplacement doivent être positives.");
            }
            this.segment1.deplacer(deplacementX, deplacementY);
            this.segment2.deplacer(deplacementX, deplacementY);
        } catch (IllegalArgumentException e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors du déplacement du Chapeau : " + e.getMessage());
        }
    }

    @Override
    public String typeForme() {
        return "C";
    }
}
