package by.step.travelagency.dao.repository;

import by.step.travelagency.dao.model.Tours;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface AbstrToursRepository extends JpaRepository<Tours, Long> {


        @Override
        List<Tours> findAllById(Iterable<Long> longs);

        //
        @Override
        Tours save(Tours tours);

        //
        @Override
        List<Tours> findAll();

        //
        @Override
        Tours getReferenceById(Long longs);

        //
        @Override
        void deleteById(Long id);

}
