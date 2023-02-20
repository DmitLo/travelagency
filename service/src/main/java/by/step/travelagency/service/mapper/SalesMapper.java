package by.step.travelagency.service.mapper;

import by.step.travelagency.dao.model.Sales;
import by.step.travelagency.service.dto.SalesDto;
import org.mapstruct.*;

//правая кнопка мыши + refactor + extract interface + выбираем классы и ввод
//@Component
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface SalesMapper {
    Sales salesDtoToSales(SalesDto salesDto);

    SalesDto salesToSalesDto(Sales sales);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    //убираем id от изменения
    //@Mapping
    Sales updateSalesFromSalesDto(SalesDto salesDto, @MappingTarget Sales sales);

}
