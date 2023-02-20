package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "nutrition")
public class Nutrition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nutrition")
    private Long id;

    @Column(name = "nutrition_nutrition", length = 100)
    private String nutrition;
    
}
