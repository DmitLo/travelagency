package by.step.travelagency.service.service.impl;

import by.step.travelagency.dao.model.Tours;
import by.step.travelagency.dao.repository.AbstrToursRepository;
import by.step.travelagency.service.dto.ToursDto;
import by.step.travelagency.service.mapper.ToursMapper;
import by.step.travelagency.service.service.AbstrToursService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service("toursServ")
public class ToursService implements AbstrToursService {


    private final AbstrToursRepository abstrToursRepository;
    private final ToursMapper toursMapper;

    public ToursDto save(ToursDto tours){
        Tours tours1 = toursMapper.toursDtoToTours(tours);
        Tours save = abstrToursRepository.save(tours1);
        ToursDto toursDto = toursMapper.toursToToursDto(save);
        return toursDto;
    }

    @Override
    public List<ToursDto> getAllTours() {
        List<Tours> all = abstrToursRepository.findAll();
        List<ToursDto> collect = all.stream().map(toursMapper::toursToToursDto).collect(Collectors.toList());
        return collect;
    }

    @Override
    public ToursDto getById(Long id) {
        return toursMapper.toursToToursDto(abstrToursRepository.findById(id).get());
    }

    //
    @Override
    public void delete(Long id){
        //удаление по id
        abstrToursRepository.deleteById(id);
    }


}
