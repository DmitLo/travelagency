package by.step.travelagency.service.mapper;

import by.step.travelagency.dao.model.Returns;
import by.step.travelagency.service.dto.ReturnsDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ReturnsMapper {
    Returns returnsDtoToReturns(ReturnsDto returnsDto);

    ReturnsDto returnsToReturnsDto(Returns returns);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    //убираем id от изменения
    //@Mapping
    Returns updateReturnsFromReturnsDto(ReturnsDto returnsDto, @MappingTarget Returns returns);

}
