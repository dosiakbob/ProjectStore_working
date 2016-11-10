package ua.com.coolshop.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.coolshop.entity.Orders;
import ua.com.coolshop.repository.OrdersRepository;
import ua.com.coolshop.service.OrdersService;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public void save(Orders orders) {
        ordersRepository.save(orders);

    }

    @Override
    public List<Orders> findAll() {

        // TODO Auto-generated method stub
        return ordersRepository.findAll();
    }

    @Override
    public Orders findOne(int id) {
        // TODO Auto-generated method stub
        return ordersRepository.findOne(id);
    }

    @Override
    public void delete(int id) {
        ordersRepository.delete(id);

    }

    @Override
    public List<Orders> findAllByFetch() {
        // TODO Auto-generated method stub
        return ordersRepository.findAllByFetch();
    }

}
