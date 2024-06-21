/**
 * Comment intégrer la librairie ardoise.jar dans votre projet Eclipse
 *
 * 1/ Créer un dossier "libs" dans votre projet Eclipse
 * Clic droit sur votre projet -> New -> Folder
 *
 * 2/ Copier ardoise.jar dans le dossier "libs"
 *
 * 3/ Déclarer ardoise.jar comme librairie externe pour votre projet
 * Clic droit sur ardoise.jar (dossier "libs") -> Build Path -> Add to Build Path
 */

/**
 * Importation des classes :
 * - PointPlan
 * - Segment
 * - Ardoise
 * qui sont fournis dans la librairie ardoise.jar
 */
import ardoise.*;

/**
 * Classe TestArdoise
 * Validation de l'intégration de la librairie ardoise.jar au projet Eclipse
 */
public class TestArdoise {
    

	public static void main(String[] args) throws InterruptedException {
		
		Ardoise ardoise = new Ardoise();
		
		
		// Oiseau 1
        Segment oiseau1Segment1 = new Segment(new PointPlan(118, 13), new PointPlan(123, 20));
        Segment oiseau1Segment2 = new Segment(new PointPlan(123, 20), new PointPlan(128, 13));
        Chapeau oiseau1 = new Chapeau("Oiseau 1", oiseau1Segment1, oiseau1Segment2);
        ardoise.ajouterForme(oiseau1);

        // Oiseau 2
        Segment oiseau2Segment1 = new Segment(new PointPlan(133, 30), new PointPlan(136, 32));
        Segment oiseau2Segment2 = new Segment(new PointPlan(136, 32), new PointPlan(138, 30));
        Chapeau oiseau2 = new Chapeau("Oiseau 2", oiseau2Segment1, oiseau2Segment2);
        ardoise.ajouterForme(oiseau2);

        // Oiseau 3
        Segment oiseau3Segment1 = new Segment(new PointPlan(142, 14), new PointPlan(144, 17));
        Segment oiseau3Segment2 = new Segment(new PointPlan(144, 17), new PointPlan(146, 14));
        Chapeau oiseau3 = new Chapeau("Oiseau 3", oiseau3Segment1, oiseau3Segment2);
        ardoise.ajouterForme(oiseau3);

        // Tour V
        Segment tourSegment1 = new Segment(new PointPlan(9, 100), new PointPlan(20, 100));
        Segment tourSegment2 = new Segment(new PointPlan(20, 100), new PointPlan(20, 198));
        Segment tourSegment3 = new Segment(new PointPlan(20, 198), new PointPlan(9, 198));
        Segment tourSegment4 = new Segment(new PointPlan(9, 198), new PointPlan(9, 100));
        Quadrilatère tour = new Quadrilatère("Tour", tourSegment1, tourSegment2, tourSegment3, tourSegment4);
        ardoise.ajouterForme(tour);
        
        
        
        GF Maison = new GF();
        // Corps maisonV
        Segment corpsSegment1 = new Segment(new PointPlan(80, 140), new PointPlan(180, 140));
        Segment corpsSegment2 = new Segment(new PointPlan(180, 140), new PointPlan(180, 198));
        Segment corpsSegment3 = new Segment(new PointPlan(180, 198), new PointPlan(80, 198));
        Segment corpsSegment4 = new Segment(new PointPlan(80, 198), new PointPlan(80, 140));
        Quadrilatère corpsMaison = new Quadrilatère("Corps maison", corpsSegment1, corpsSegment2, corpsSegment3, corpsSegment4);
        Maison.ajouterForme(corpsMaison);
        
        // Toit maisonV
        Segment toitSegment1 = new Segment(new PointPlan(80, 140), new PointPlan(130, 100));
        Segment toitSegment2 = new Segment(new PointPlan(130, 100), new PointPlan(180, 140));
        Chapeau toitMaison = new Chapeau("Toit maison", toitSegment1, toitSegment2);
        Maison.ajouterForme(toitMaison);
        
        // Porte maisonV
        Segment porteSegment1 = new Segment(new PointPlan(120, 170), new PointPlan(140, 170));
        Segment porteSegment2 = new Segment(new PointPlan(140, 170), new PointPlan(140, 198));
        Segment porteSegment3 = new Segment(new PointPlan(140, 198), new PointPlan(120, 198));
        Segment porteSegment4 = new Segment(new PointPlan(120, 198), new PointPlan(120, 170));
        Quadrilatère porteMaison = new Quadrilatère("Porte maison", porteSegment1, porteSegment2, porteSegment3, porteSegment4);
        Maison.ajouterForme(porteMaison);
        
        ardoise.ajouterForme(Maison);
        
            
        // Etoile
        GF etoile = new GF();
        
        Segment etoileSegment1 = new Segment(new PointPlan(170, 52), new PointPlan(173, 45));
        Segment etoileSegment2 = new Segment(new PointPlan(173, 45), new PointPlan(177, 52));
        Segment etoileSegment3 = new Segment(new PointPlan(177, 52), new PointPlan(184, 57));
        Segment etoileSegment4 = new Segment(new PointPlan(184, 57), new PointPlan(177, 60));
        Segment etoileSegment5 = new Segment(new PointPlan(177, 60), new PointPlan(174, 66));
        Segment etoileSegment6 = new Segment(new PointPlan(174, 66), new PointPlan(170, 60));
        Segment etoileSegment7 = new Segment(new PointPlan(170, 60), new PointPlan(164, 57));
        Segment etoileSegment8 = new Segment(new PointPlan(164,57), new PointPlan(170, 52));
        
        Chapeau etoileBranche1 = new Chapeau("Etoile - Branche 1", etoileSegment1, etoileSegment2);
        Chapeau etoileBranche2 = new Chapeau("Etoile - Branche 2", etoileSegment3, etoileSegment4);
        Chapeau etoileBranche3 = new Chapeau("Etoile - Branche 3", etoileSegment5, etoileSegment6);
        Chapeau etoileBranche4 = new Chapeau("Etoile - Branche 4", etoileSegment7, etoileSegment8);
        
        etoile.ajouterForme(etoileBranche1);
        etoile.ajouterForme(etoileBranche2);
        etoile.ajouterForme(etoileBranche3);
        etoile.ajouterForme(etoileBranche4);
        ardoise.ajouterForme(etoile);

        
        
        GF Montagne=new GF();
        // Montagne 1
        Segment montagne1Segment1 = new Segment(new PointPlan(3, 14), new PointPlan(43, 3));
        Segment montagne1Segment2 = new Segment(new PointPlan(43, 3), new PointPlan(112, 14));
        Segment montagne1Segment3 = new Segment(new PointPlan(112, 14), new PointPlan(3, 14));
        Triangle montagne1 = new Triangle("Montagne 1", montagne1Segment1, montagne1Segment2, montagne1Segment3);
        Montagne.ajouterForme(montagne1);

        // Montagne 2
        Segment montagne2Segment1 = new Segment(new PointPlan(152, 7), new PointPlan(166, 3));
        Segment montagne2Segment2 = new Segment(new PointPlan(166, 3), new PointPlan(172, 7));
        Segment montagne2Segment3 = new Segment(new PointPlan(172, 7), new PointPlan(152, 7));
        Triangle montagne2 = new Triangle("Montagne 2", montagne2Segment1, montagne2Segment2, montagne2Segment3);
        Montagne.ajouterForme(montagne2);
           
        ardoise.ajouterForme(Montagne);
        
        
        ardoise.dessinerGraphique();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Gérer l'interruption
        }
        ardoise.deplacer("C", 10, 20);
        ardoise.deplacer("Oiseau 2", 10, 20);
       
    }
}