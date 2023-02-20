package by.step.travelagency.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ToursDto {
    private Long id;
    private String tour;
    private Long price;
    private String dateDep;
    private String cityDep;
    private String operator;
    private Integer numberAdCh;
    private Integer numberDayNig;
    private CountriesDto countries;
    private ToursTypesDto toursTypes;
    private NutritionDto nutrition;
    private HotelsDto hotels;
    private DiscountsDto discounts;

}
