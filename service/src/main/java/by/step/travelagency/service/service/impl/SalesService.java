package by.step.travelagency.service.service.impl;

import by.step.travelagency.dao.model.Sales;
import by.step.travelagency.dao.repository.AbstrSalesRepository;
import by.step.travelagency.service.dto.SalesDto;
import by.step.travelagency.service.mapper.SalesMapper;
import by.step.travelagency.service.service.AbstrSalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service("salesServ")
public class SalesService implements AbstrSalesService {


    private final AbstrSalesRepository abstrSalesRepository;
    private final SalesMapper salesMapper;

    public SalesDto save(SalesDto sales){
        Sales sales1 = salesMapper.salesDtoToSales(sales);
        Sales save = abstrSalesRepository.save(sales1);
        SalesDto salesDto = salesMapper.salesToSalesDto(save);
        return salesDto;
    }

    @Override
    public List<SalesDto> getAllSales() {
        List<Sales> all = abstrSalesRepository.findAll();
        List<SalesDto> collect = all.stream().map(salesMapper::salesToSalesDto).collect(Collectors.toList());
        return collect;
    }

}
