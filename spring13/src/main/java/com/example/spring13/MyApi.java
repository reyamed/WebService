package com.example.spring13;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;


@RestController
public class MyApi {

    public static ArrayList<Etudiant> liste = new ArrayList<>();
static {
    liste.add (new Etudiant (  0,  "A",  19)) ;
    liste.add (new Etudiant (  1,  "A",  19)) ;
    liste.add (new Etudiant (  2,  "A",  19)) ;
    liste.add (new Etudiant (  3,  "A",  19)) ;

}
    @GetMapping(value = "/liste")
    public ArrayList<Etudiant> getAllEtudiant() {
        return liste;
    }

    @GetMapping(value = "/getEudiant")
    public Etudiant getAllEtudiant(int identifiant) {
        return liste.get(identifiant);
    }

    @PostMapping(value= "/addEtudiant")
    public Etudiant addEtudiant(Etudiant etudiant) {
        liste.add(etudiant);

        return etudiant;
    }

    @DeleteMapping(value= "/delete")
    public void deleteEtudiant(int identifiant) {
        liste.remove(identifiant);


    }

    @PutMapping (value = "/modifier")
    public void modifierEtudiant (int identifiant, String nom) {
                liste.get(identifiant).setNom(nom);
}

    @GetMapping(value = "/b")
    public String bonjour () {
        return "Bonjour !";
    }

    @GetMapping(value = "/d")
    public String bonsoir () {
        return "bonsoir !";
    }
    @GetMapping(value = "/etudiant")
    public Etudiant getEtudiant () {
        return new Etudiant(1, "A", 19);
    }

    @GetMapping(value = "/somme")
    public double somme(double a, double b){
        return a+b;
    }

}

