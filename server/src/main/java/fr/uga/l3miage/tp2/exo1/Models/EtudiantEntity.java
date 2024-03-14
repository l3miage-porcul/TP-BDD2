package fr.uga.l3miage.tp2.exo1.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EtudiantEntity {

    @Id
    private long agalan;

    private String nom;
    private String email;

    @ManyToMany
    private Set<ClubSportifEntity> clubs;
}
