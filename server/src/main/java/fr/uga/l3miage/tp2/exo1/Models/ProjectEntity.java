package fr.uga.l3miage.tp2.exo1.Models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "projet")
public class ProjectEntity {

    @Id
    private int id;

    private String name;
    private String description;

    @ManyToMany
    private Set<DeveloperEntity> developers;
}
