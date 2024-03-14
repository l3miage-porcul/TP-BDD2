package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ClientEntity {

    @Id
    private long id;

    private String nom;
    private String email;

    @OneToOne (mappedBy = "client")
    private AdresseEntity adresse;

    @OneToMany(mappedBy = "clientCommande")
    private Set<CommandeEntity> commandes;
}
