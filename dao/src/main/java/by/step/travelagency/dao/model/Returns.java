package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "returns")
public class Returns {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_returns")
    private Long id;

    @Column(name = "date_returns")
    private String date;

    @Column(name = "quantity_returns")
    private Long quantity;

    @Column(name = "cause_returns", length = 100)
    private String cause;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "clients_id")
    private Clients clients;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employees_id")
    private Employees employees;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tours_id")
    private Tours tours;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_id")
    private Sales sales;
}
