package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_clients")
    private Long id;

    @Column(name = "passport_clients", length = 100)
    private String passport;

    @Column(name = "phone_clients", length = 100)
    private String phone;

    @Column(name = "last_first_sur_clients", length = 100)
    private String lastFirstSurname;

}
