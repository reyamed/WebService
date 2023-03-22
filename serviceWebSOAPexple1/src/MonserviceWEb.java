import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.supgalilé.fr")
public class MonserviceWEb {

    @WebMethod(operationName ="methode1")

    public double converions(double mt) {
        return mt*0.9;
    }

    public double somme(@WebParam(name = "parametre1") double a, double b) {
        return a+b;
    }

    public Etudiant getEtudiant(int id) {
        return new Etudiant(1, "luigi", 1);
    }
}
