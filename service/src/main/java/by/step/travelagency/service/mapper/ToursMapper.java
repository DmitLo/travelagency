package by.step.travelagency.service.mapper;

import by.step.travelagency.dao.model.Tours;
import by.step.travelagency.service.dto.ToursDto;
import org.mapstruct.*;

//правая кнопка мыши + refactor + extract interface + выбираем классы и ввод
//@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ToursMapper {
    Tours toursDtoToTours(ToursDto toursDto);

    ToursDto toursToToursDto(Tours tours);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    //убираем id от изменения
    //@Mapping
    Tours updateToursFromToursDto(ToursDto toursDto, @MappingTarget Tours tours);

}
