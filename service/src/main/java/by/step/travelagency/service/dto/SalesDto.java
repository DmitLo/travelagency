package by.step.travelagency.service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SalesDto {
    private Long id;
    private String date;
    private Long quantity;
    private ClientsDto clients;
    private EmployeesDto employees;
    private ToursDto tours;

}
