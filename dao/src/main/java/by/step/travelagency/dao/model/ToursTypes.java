package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tours_types")
public class ToursTypes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tours_types")
    private Long id;

    @Column(name = "types_tours_types", length = 100)
    private String types;
    
}
