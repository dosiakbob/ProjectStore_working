package ua.com.coolshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.coolshop.entity.Commodity;

public interface CommodityRepository extends JpaRepository<Commodity, Integer>{

}
