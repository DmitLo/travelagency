package by.step.travelagency.service.service;

import by.step.travelagency.service.dto.SalesDto;

import java.util.List;

public interface AbstrSalesService {
    SalesDto save(SalesDto sales);

    List<SalesDto> getAllSales();

//    List<Sales> getAllTravelersJPQL();
//
//    List<Sales> getAllTravelersNative();

}
