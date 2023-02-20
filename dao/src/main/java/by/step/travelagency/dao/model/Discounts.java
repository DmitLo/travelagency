package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "discounts")
public class Discounts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_discounts")
    private Long id;

    @Column(name = "discount_discounts")
    private Boolean discount;

    @Column(name = "size_discounts")
    private Integer size;
    
}
