package ua.com.coolshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ua.com.coolshop.entity.Orders;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    @Query("select distinct d from Orders d left join fetch d.commodities i")
    List<Orders> findAllByFetch();
}
