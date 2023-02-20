package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employees")
    private Long id;

    @Column(name = "last_first_sur_employees", length = 100)
    private String lastFirstSurname;

    @Column(name = "phone_employees", length = 100)
    private String phone;
    
}
