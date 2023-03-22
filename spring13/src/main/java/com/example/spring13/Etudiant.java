package com.example.spring13;

public class Etudiant {
    private int identifiant;
    private String nom;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public Etudiant() {

    }

    public String getNom() {
        return nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    private double moyenne;
    public Etudiant (int identifiant, String nom, double moyenne){
            this.identifiant = identifiant;
            this.nom = nom;
            this.moyenne = moyenne;
        }
}
