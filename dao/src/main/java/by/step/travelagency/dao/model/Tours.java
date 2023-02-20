package by.step.travelagency.dao.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tours")
public class Tours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tours")
    private Long id;

    @Column(name = "tour_tours", length = 100)
    private String tour;

    @Column(name = "price_tours")
    private Long price;

    @Column(name = "date_dep_tours")
    private String dateDep;

    @Column(name = "city_dep_tours", length = 100)
    private String cityDep;

    @Column(name = "operator_tours", length = 100)
    private String operator;

    @Column(name = "number_ad_ch_tours")
    private Integer numberAdCh;

    @Column(name = "number_day_nig_tours")
    private Integer numberDayNig;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "countries_id")
    private Countries countries;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tours_types_id")
    private ToursTypes toursTypes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nutrition_id")
    private Nutrition nutrition;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotels_id")
    private Hotels hotels;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "discounts_id")
    private Discounts discounts;
}
