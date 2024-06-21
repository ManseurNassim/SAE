import ardoise.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Quadrilatère extends Forme {
    private Segment segment1;
    private Segment segment2;
    private Segment segment3;
    private Segment segment4;

    public Quadrilatère(String nom, Segment segment1, Segment segment2, Segment segment3, Segment segment4) {
        super(nom);
        try {
            if (segment1.getPointDepart().equals(segment2.getPointArrivee())) {
                throw new IllegalArgumentException("Les segments fournis ne forment pas une forme valide.");
            }
            this.segment1 = segment1;
            this.segment2 = segment2;
            this.segment3 = segment3;
            this.segment4 = segment4;
        } catch (IllegalArgumentException e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors de la création du Quadrilatère : " + e.getMessage());
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
            System.out.println("Erreur lors de l'accès au segment3 du Quadrilatère : " + e.getMessage());
        }
        return segment3;
    }

    public Segment getSegment4() {
        return segment4;
    }

    @Override
    public ArrayList<Segment> dessiner() {
        ArrayList<Segment> segments = new ArrayList<>();
        
        segments.add(segment1);
        segments.add(segment2);
        segments.add(segment3);
        segments.add(segment4);
        
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
            this.segment3.deplacer(deplacementX, deplacementY);
            this.segment4.deplacer(deplacementX, deplacementY);
        } catch (IllegalArgumentException e) {
            // Gérer l'exception, par exemple, afficher un message d'erreur ou effectuer une autre action appropriée
            System.out.println("Erreur lors du déplacement du Quadrilatère : " + e.getMessage());
        }
    }

    @Override
    public String typeForme() {
        return "Q";
    }
}
