package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "hotels")
public class Hotels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hotels")
    private Long id;

    @Column(name = "name_hotels", length = 100)
    private String nameHotel;

    @Column(name = "type_hotels", length = 50)
    private String typeHotel;

    @Column(name = "class_hotels")
    private Integer classHotel;
    
}
