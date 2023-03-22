import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Etudiant implements Serializable {
    private int id;
    private String nom;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, double moyenne) {
        this.id = id;
        this.nom = nom;
        this.moyenne = moyenne;
    }
}
