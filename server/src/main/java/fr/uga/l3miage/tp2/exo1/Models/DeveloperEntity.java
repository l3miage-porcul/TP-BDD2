package fr.uga.l3miage.tp2.exo1.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "developer_miage")
public class DeveloperEntity {

    @Id
    private String lastname;

    private String firstname;
    private String email;

    @ManyToMany (mappedBy = "projet")
    private Set<ProjectEntity> projets;
}
