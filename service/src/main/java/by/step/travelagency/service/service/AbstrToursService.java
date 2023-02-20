package by.step.travelagency.service.service;

import by.step.travelagency.service.dto.ToursDto;

import java.util.List;

public interface AbstrToursService {
    ToursDto save(ToursDto tours);

    List<ToursDto> getAllTours();

    ToursDto getById(Long id);

    //
    void delete(Long id);

//    List<Tours> getAllTravelersJPQL();
//
//    List<Tours> getAllTravelersNative();


}
