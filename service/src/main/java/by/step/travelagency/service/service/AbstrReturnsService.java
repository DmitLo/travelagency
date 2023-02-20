package by.step.travelagency.service.service;

import by.step.travelagency.service.dto.ReturnsDto;

import java.util.List;

public interface AbstrReturnsService {
    ReturnsDto save(ReturnsDto returns);

    List<ReturnsDto> getAllReturns();

//    List<Returns> getAllTravelersJPQL();
//
//    List<Returns> getAllTravelersNative();
}
