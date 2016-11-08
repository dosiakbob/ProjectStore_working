package ua.com.coolshop.service;

import org.springframework.stereotype.Service;
import ua.com.coolshop.entity.Commodity;

import java.util.List;

@Service
public interface CommodityService {
    void save(Commodity commodity);

    List<Commodity> findAll();

    Commodity findOne(int id);

    void delete(int id);

}
