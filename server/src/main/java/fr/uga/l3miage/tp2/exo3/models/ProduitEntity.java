package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ProduitEntity {

    @Id
    private long id;

    private String nom;
    private double prix;
    private int quantite;

    @ManyToOne
    private CommandeEntity commande;

    @ManyToOne
    private CategorieDeProduitEntity categorie;
}
