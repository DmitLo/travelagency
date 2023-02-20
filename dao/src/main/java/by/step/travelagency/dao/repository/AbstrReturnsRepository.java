package by.step.travelagency.dao.repository;

import by.step.travelagency.dao.model.Returns;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbstrReturnsRepository extends JpaRepository<Returns, Long> {


        @Override
        List<Returns> findAllById(Iterable<Long> longs);

//        @Query("SELECT u FROM Returns u WHERE u.id = 1")
//        List<Returns> findAllActiveUsers();
//
//        @Query(
//                value = "SELECT * FROM returns u WHERE u.id = 1",
//                nativeQuery = true)
//        List<Returns> findAllActiveUsersNative();

}
