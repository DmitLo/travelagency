package by.step.travelagency.service.service.impl;


import by.step.travelagency.dao.model.Returns;
import by.step.travelagency.dao.repository.AbstrReturnsRepository;
import by.step.travelagency.service.dto.ReturnsDto;
import by.step.travelagency.service.mapper.ReturnsMapper;
import by.step.travelagency.service.service.AbstrReturnsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service("returnServ")
public class ReturnsService implements AbstrReturnsService {


    private final AbstrReturnsRepository abstrReturnsRepository;
    private final ReturnsMapper returnsMapper;

    public ReturnsDto save(ReturnsDto returns){
        Returns returns1 = returnsMapper.returnsDtoToReturns(returns);
        Returns save = abstrReturnsRepository.save(returns1);
        ReturnsDto returnsDto = returnsMapper.returnsToReturnsDto(save);
        return returnsDto;
    }

    @Override
    public List<ReturnsDto> getAllReturns() {
        List<Returns> all = abstrReturnsRepository.findAll();
        List<ReturnsDto> collect = all.stream().map(returnsMapper::returnsToReturnsDto).collect(Collectors.toList());
        return collect;
    }

}
