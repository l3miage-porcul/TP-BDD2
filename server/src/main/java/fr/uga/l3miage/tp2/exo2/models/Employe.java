package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Employe {

    @Id
    private long id;

    private String nom;
    private String email;
    private double salaire;
}
