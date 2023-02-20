package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sales")
    private Long id;

    @Column(name = "date_sales", length = 100)
    private String date;

    @Column(name = "quantity_sales")
    private Long quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clients_id")
    private Clients clients;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employees_id")
    private Employees employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tours_id")
    private Tours tours;

}
