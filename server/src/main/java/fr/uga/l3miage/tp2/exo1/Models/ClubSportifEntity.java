package fr.uga.l3miage.tp2.exo1.Models;

import javax.persistence.*;
import java.util.Set;


@Entity
public class ClubSportifEntity {

    @Id
    private long id;

    private String nom;
    private String description;

    @ManyToMany (mappedBy = "clubs")
    private Set<EtudiantEntity> etudiants;
}
