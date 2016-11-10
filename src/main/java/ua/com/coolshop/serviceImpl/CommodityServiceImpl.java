package ua.com.coolshop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.coolshop.entity.Commodity;
import ua.com.coolshop.repository.CommodityRepository;
import ua.com.coolshop.service.CommodityService;

import java.util.List;

@Service
public class CommodityServiceImpl implements CommodityService{

    @Autowired
    private CommodityRepository commodityRepository;

    public void save(Commodity commodity) {
        commodityRepository.save(commodity);

    }

    public List<Commodity> findAll() {
        return commodityRepository.findAll();

    }

    public Commodity findOne(int id) {
        return commodityRepository.findOne(id);

    }

    public void delete(int id) {
        commodityRepository.delete(id);

    }


}
