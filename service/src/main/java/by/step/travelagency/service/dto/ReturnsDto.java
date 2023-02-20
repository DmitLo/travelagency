package by.step.travelagency.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReturnsDto {
    private Long id;
    private String types;
    private String date;
    private Long quantity;
    private String cause;
    private ClientsDto clients;
    private EmployeesDto employees;
    private ToursDto tours;
    private SalesDto sales;



}
