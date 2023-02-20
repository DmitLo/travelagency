package by.step.travelagency.dao.repository;

import by.step.travelagency.dao.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AbstrSalesRepository extends JpaRepository<Sales, Long> {

        @Override
        List<Sales> findAllById(Iterable<Long> longs);

//        @Query("SELECT u FROM Sales u WHERE u.id = 1")
//        List<Sales> findAllActiveUsers();
//
//        @Query(
//                value = "SELECT * FROM sales u WHERE u.id = 1",
//                nativeQuery = true)
//        List<Sales> findAllActiveUsersNative();

}
