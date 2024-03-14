package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

@Entity
public class CommandeEntity {

    @Id
    private long id;

    private Date date;
    private double montantTotal;

    @ManyToOne
    private ClientEntity clientCommande;

    @OneToMany (mappedBy = "commande")
    private Set<ProduitEntity> produits;


}
